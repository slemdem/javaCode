package java0119;

public class EnumAndSingleTon extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enum 의미있는 상수를 정의하고 프로그램의안정성을 위해 사용되는 singleton의 일종
		// singleton : 인스턴스 생성 패턴 중 하나
		//				인스턴스를 한 번 생성하고 인스턴스 내용을
		//				여러 메서드에서 공유하여 사용하는 패턴
		// 싱글톤 패턴은 new 키워드로 인스턴스를 생성하지 못하게 한다
		// 그와 동시에 인스턴스를 생성할 수 있는 특정한 정적 메소드를 통해서만
		// 인스턴스를 생성하도록 처리하고 인스턴스는 
		// 정적 변수에 저장하여 인스턴스에 접근할 수 있도록 한다
		
//		//뷔페에 사서 원하는 음식을 선택하는 프로그램
//		//음식별로코드를 부여하고
//		//해당 코드 선택시 음식을 가져오도록 함
//		int choice = 0;
//		
		// 메서드를 호출해서 결과를 출력하는 부분은 문제가 x
		//but 정수로된 모든 인수를 전달받을 수 있어서 음수를 집어넣으면 문제가 발생할 수 있다
		Person person = new Person();
		Person.choice(FoodCategory.PIZZA);
		
		//상수관련 메서드
		//name : enum 상수에 정의된 이름을 리턴
		//System.out.println(FoodCategory.KAL.name());
		//ordinal :enum 상수에 정의된 순서값을 리턴
		//System.out.println(FoodCategory.PIZZA.ordinal());
		
		System.out.println(FoodCategory.CHICKEN.name);
		System.out.println(FoodCategory.KAL.price);
		
		// enum의 생성자는 기본적으로 private
		
		// 싱글톤 패턴으로 작성된 클래스에서 인스턴스 생성하기
		
		// 싱글톤 사용의 이유 : 생성되는 인스턴스들이 동일한 참조값을 리턴하기 때문에
		//					메모리 공간을 절약할 수 있다
		
		// 인스턴스 변수를 선언하여 사용하거나 메소드
		Configuration con1 = Configuration.getInstance();
		Configuration con2 = Configuration.getInstance();
		
		System.out.println(con1.getTest1Name());
		System.out.println(con2.getTest2Name());

	}

}
