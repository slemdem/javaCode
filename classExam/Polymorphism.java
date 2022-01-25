package classExam;

class Dog {
	public String color;
	
	public void bite() {
		System.out.println("깨물기");
	}
	public void bark() {
		System.out.println("짖기");
	}
	public void eat() {
		System.out.println("밥먹기");
	}
	
	public void showColor() {
		System.out.println("개의 색은 " + color +"이다");
	}
	
}

class Viggle extends Dog{
	
}
class GoldenRetriver extends Dog{
	public void swim() {
		System.out.println("수영하기");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
//		// 객체의 형변환-> 바꾼 자료형으로 사용하겠다.
//		// 	 - 인스턴스가 변한 것은 아니다
//		
//		Dog d1 = new Dog();
////		GoldenRetriver d2 = new GoldenRetriver();
//		//아래의 코드는 개는 골드리트리버다 라고 하는 것과 같음
//		GoldenRetriver d2 =(GoldenRetriver)d1;
//		
//		// 비글은 개다 라고 이야기 하는 것과 같음
//		// 객체의 형변환
//		Dog dd = new Viggle();
//		Viggle v1 = (Viggle)dd;
//		
//		// 리트리버는 개다
//		// 개는 리트리버다
//		
//		// 다형성
//		// 객체지향 언어의 특성중 하나
//		// 여러가지 형태에 속할 수 있는 성질이란 뜻으로
//		// 하나의 객체 인스턴스가 여러가지 자료형을 가질 수 있는 것
//		
//		// is-a
//		// 1. 산소는 기체이다
//		// 2. 사모예드는 개다
//		// 3. 코리안 숏헤어는고양이다
//		// 4. 프로그래밍 언어는 JAVA다
//		
//		// 문제 
//		// 부모 클래스 Dog를 상속받는 
//		// Viggle 클래스와 GoldenRetriver 클래스를 생성하시고
//		// 이중  GoldenRetriver 클래스는 수영할 수 있다 가정하고 swim 매소드를 추가하세요
//		
//		// Dog크래스의 기본 기능
//		// 필드 색깔
//		// 기본행동 : 깨물기 밥먹기 짖기
		
		// instanceof
		// 해당 인스턴스가 특정 클래스의 인스턴스인지 확인하는 연산자
		// 변수명 or 인스턴스명 + instanceof + 클래스 명
		
		Dog dog = new GoldenRetriver();
		System.out.println(dog instanceof GoldenRetriver); //true
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Viggle);
		
	}

}
