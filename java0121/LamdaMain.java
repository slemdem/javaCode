package java0121;

class Test0121{
	public void testMethod() {
		System.out.println("test");
	}
	
}

public class LamdaMain {

	public static void main(String[] args) {
		// 익명 클래스 : 상속받는 클래스를 명시적으로 별도의 Java파일을 통해
		// 		클래스를 만드는게 아니라 코드 내부에 이름이 존재하지 않는 클래스를 만드는것
		
		// Test 0121 클래스를 상속받는 익명의 클래스 생성
//		Test0121 test = new Test0121() {
//			//Test0121클래스에서 익명의 클래스로 오버라이딩
//			public void testMethod() {
//				System.out.println("오버라이딩");
//			}
//			//새로운 메소드 생성
//			// 외부에서 호출은 불가능
//			// 생성된 인스턴스 test는 Test0121클래스가 아니라
//			// Test0121클래스를 상속받는 익명클래스이기 때문
//			public void serve() {
//				System.out.println("lol");
//			}
//		};
//		
//		test.testMethod();
		// 익명클래스의 존재 이유?
		// 추상클래스와 인터페이스 관리
		//	 -> 내용이 가벼울 경우 익명클래스를 이용해서 처리하기도 한다
		
		// 추상클래스를 익명 클래스로 정의해도 메서드는 반드시 재정의 되어야 한다
//		// 추상클래스를 익명클래스로 정의해도 메서드는 반드시 재정의 되어야한다.
		People p1 = new People() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("으어 졸려");
				walk();
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		p1.sleep();
		
		//Operate 인터페이스를 이용해서 람다식 구현
		
		// 람다 표현식의 사용 조건
		// 1. 인터페이스
		// 2. 인터페이스에 하나의 추상 메서드만 선언
		
		
//		Operate operate =(a,b) -> {
//			return a+b;
//		};
		
//		Cal c1 = new Cal(100,200);
//		
//		int result = c1.result((a,b) -> {
//			return a+b;
//		});
//		
//		System.out.println(result);
//		
	}

}
