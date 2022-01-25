package classExam;

class MemberCall {
	int iv = 100; // 인스턴스 변수 선언
	static int cv = 250; // 클래스 변수 선언
	
	// 인스턴스 멤버가 존재하는 시점에는 클래스 멤버는 항상 존재한다
	// 클래스 맴버가 존재하는 시점에 인스턴스 맴버가 존재한다는 보장은 없다
	int iv2 = cv;// 클래스 필드의 값을 인스턴스 필드에 삽입
	//static int cv2 = iv;// 보통의 방법으로 인스턴스 필드의 값을 클래스 필드에 삽입 불가능
	static int cv2 = new MemberCall().iv;//이렇게 하면 가능(대단히 귀찮다)
	
	// 인스턴스 메소드에서 클래스 변수 사용 가능
	void instancMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	// 클래스 메소드에서 인스턴스 변수는 사용 불가능
	static void staticMethod1() {
//		System.out.println(iv);
		System.out.println(cv);
	}
	
}

public class StaticExam {

	public static void main(String[] args) {
		MemberCall me = new MemberCall();
		System.out.println(me.cv);
		System.out.println(me.iv);
		System.out.println(me.iv2);
		
	}

}
