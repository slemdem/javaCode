package classExam;

class Cat{
	String color = "갈색";
	
	public void sleep() {
		System.out.println("zzzzzzzzzzzZZZZZZZZZZ");
	}
	public void bite() {
		System.out.println("쾈");
	}
	public void eat() {
		System.out.println("고양이 사료 먹는 중");
	}
}

class Lion extends Cat{
	String color = "노란색";
	// cat의 bite 메소드 오버라이딩
	public void bite() {
		super.bite();
		System.out.println("당신은 운명하였습니다.");
	}
	public void eat() {
		System.out.println("고기 먹는 중");
	}
}


public class OverridingExam {

	public static void main(String[] args) {
		// 오버라이드 -> 우선시하다
		// 부모클래스에 정의된 내용보다 자식클래스에서 정의된 내용을 더 우선시
		// 행위의 내용을 재 정의
		
		Lion chunsik = new Lion();
		Cat streetcat = new Lion();
		Cat strcat2 = new Cat();
		// 다형성과 오버라이드 
		// 오버라인드가 된 메서드가 존재한다면 
		// 내용이 달라진다
		
		// Lion 클래스에 정의된 메소드 eat 호출
		chunsik.eat();
		chunsik.bite();
		// Cat 클래스의 eat 호출
		streetcat.eat();
		streetcat.bite();
		
		// 그렇다면 부모클래스의 메서드를 호출하는방법은 없는가?
		// super.메소드 명()
		
		// 메소드의 오버라이딩 ->필드도 오버라이딩 가능? X 불가능
		System.out.println(chunsik.color);
		System.out.println(streetcat.color);
		System.out.println(strcat2.color);
		
	}

}
