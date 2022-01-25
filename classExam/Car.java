package classExam;

public class Car { //클래스명
	
	private String mName; //필드(인스턴스 변수)
	private int mYear;//필드(인스턴스 변수)
	static int test123;
	// 필드는 선언된 위치에 따라 3가지로 구분한다.
	// 1. 클래스 변수
	//		-클래스 영역에 위치한 변수중 static키워드를 가지는 변수
	// 2. 인스턴스 변수
	//		-클래스 영역에 위치한 변수중 static키워드가 없는 변수
	// 3. 지역 변수
	//		-메소드, 생성자, 초기하 블록 내에 위치한 변수
	
	// 클래스 변수 vs 인스턴스 변수
	// 생성과 소멸시기, 메모리 공간과 사용 방법까지도 다르다
	// 클래스 변수는 클래스가 메모리에 올라갈 때 생성되며 소멸시기는 프로그램이 종료할 때
	// 인스턴스 변수는 인스턴스가 생성될 때 생성되고 소멸한다 
	
	Car(String mName, int modelYear){ //생성자
		// 생성된 객체 필드를 초기화해주는 특별한 메서드
		this.mName = mName;//초기화
		this.mYear = mYear;//초기화
	}
	
	public String getModel() {//메서드
		// 함수 + 메서드(멤버함수)
		// 하나의 기능을 수행하는 일련의 코드
		// 구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어를 반환
		
		int n = 1; //지역변수
		return this.mYear + "년식" + this.mName +"";
	}
	
}
