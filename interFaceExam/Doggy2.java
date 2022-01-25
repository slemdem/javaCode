package interFaceExam;

public abstract interface Doggy2 {
	
	//인터페이스도 추상클래스처럼 abstract 메소드를 이용해서
	// 추상 메소드를 생성한다 모든 클래스는 static final이어야 한다
	
	//인터페이스의 특징
	// 1. 생성자를 선언 및 정의할 수 없음
	//	- 인터페이스의 사용용도
	//		추상클래스는 확장을 위해서 사용하지만
	// 		인터페이스는 메소드의 규약을 위해 사용하는 경우가 많기 때문
	// 2. 인터페이스 내에서 선언하는 필드는 상수형태로 선언
	// 3. 인터페이스 내에서 선언된 메소드는 추상 메소드로 작업해야 한다.(적어도 java 1.8까지는)
	// 4. 상속받는 클래스는 반드시 인터페이스의 메소드를 오버라이딩 해야한다
	// 5. 인터페이스의 내용을 실제로 구현하는 클래스는 implements해야한다
	
	// 추상클래스 vs 인터페이스
	// 2. 생성자 정의 가능여부
	// 2. 변수 제어
	
	public static final String color = "검정";
	
	public abstract void playing();

	public abstract void sleep();
	
	public abstract void eat();
	
	public static String getcolor() {
		return color;
	}
	
}
