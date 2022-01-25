package NewCar.CarContent;

public class Wheel {
	// 필드영역
	String name;
	// 생성자
	Wheel(String wheelName) {
		this.name = wheelName;
	}
	
	// 메서드
	void go() {
		System.out.println(String.format("%s의 바퀴가 굴러갑니다", name));
	}
	
	

}
