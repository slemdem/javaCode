package classExam;

class A{
	public int data = 10;
	
	public void msg() {
		System.out.println("test");
	}
}

public class Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자
		//자바에서 객체의 생성과 동시에 인스턴스를 원하는 값으로 초기화하는 메소드
		
		// 클래스로 객체 생성시 ->해당 객체 -> 메모리에 즉시생성->
		// 이런식으로 객체가 생성되었다면 모든 인스턴스 
		
		//사용자가 원하는 값으로 인스턴스 변수를 초기화 하려면 
		// ->일반적이 초기화 방식으로는 힘들다.
		//->인스턴스 중에서 private 타입이 있기 때문
		
		// 생성자의 종류
		// 기본 생성자
		//	- 모든 클래스에는 하나 이상의 생성자가 정의 되어야 함
		//	- 특별히 생성자 정의 없이 인스턴스 생성이 가능
		//		->컴파일러가 기본생성자를 기본적으로 제공
		//	- 기본 생성자는 파라미터를 가지고 있지 않음
		// 클래스명() {}
		
		// 접근지정자
		// 클래스, 메소드, 변수에서 맴버의 접근을 제한하는 역할
		// 1. public : 모든 접근 허용
		//		- 어떠한 클래스도 접근 허용
		// 2. protected : 같은 패키지, 상속받은 클래스에서만 접근 가능
		// 3. private : 같은 클래스 내에서만 접근가능
		// 4. default : 기본 제한자 자신 클래스 내부와 같은 패키지 내부에서만 접근이 가능
		
		A obj = new A();
		System.out.println(obj.data);

	}

}
