package classExam;

//public class People{
//	
//	private final Table table;
//	private final Spoon spoon;
//	private final Rice rice;
//	
//	public People(Table table, Spoon spoon, Rice rice) {
//		this.table = table;
//		this.spoon = spoon;
//		this.rice = rice;
//	}
//	
//	public void eat() {
//		table.seat();
//		spoon.taken();
//		spoon.up();
//		rice.eaten();
//	}
//}


// abstract 클래스 : 추상클래스
// 추상화를 좀 더 구체적으로 도와주는 키워드
abstract class Doggy {
	public String color;
	
	public Doggy(String color) {
		this.color = color;
	}
	
	//추상 메소드
	// 추상 메소드는 메소드 명, 리턴 타입, 파라미터만 선언하고 내용은 정의하지 않음
	// 내용 정의는 하위 클래스에서 재 정의하여 사용
	public abstract void bite();
	public abstract void eat();
	
	public void bark() {
		System.out.println("왈왈");
	}
}

// 추상클래스를 상속받는다면
// 추상클래스의 추상메고드를 반드시 오버라이딩 해야한다
class Husky extends Doggy{
	
	public Husky(String color) {
		super(color);
		
	}
	
	@Override
	public void bite() {
		System.out.println("콰직");
	}
	@Override
	public void eat() {
		
	}
	
}
class Shiva extends Doggy{

	public Shiva(String color) {
		super(color);
		
	}
	
	@Override
	public void bite() {
		
	}
	@Override
	public void eat() {

		System.out.println("촵촵");
	}
	public void swim() {
		System.out.println("수영하기");
	}
}


public class Abstration {

	public static void main(String[] args) {
		// 추상화 : 내용보다 핵심적인 개념을 추려내는 것
		// 1. 핵심적인 것을 추려낸다
		// 2. 추려낸 것들을 노출시킨다.
		// 3. How보다 What에 포커스를 둔다
		
		//ex ) 밥을 먹는다
		// 밥을 먹는다의 행동
		// - 식탁에 앉기
		//		플라스틱 식탁? 철 식탁? 나무 식탁?
		//	- 숟가락 들기
		//		금수저? 음수저? 플라스틱?
		//	- 밥 푸기
		//		쌀밥? 흑미밥?
		//	- 밥을 입으로 가져가기
		
		Husky dog1 = new Husky("검정");
		
		dog1.bite();
		
		Shiva dog2 = new Shiva("갈색");
		dog2.eat();
		
		Doggy dog3 = new Husky("흰색");
		
		dog3.bite();
	}

}
