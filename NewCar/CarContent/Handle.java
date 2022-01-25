package NewCar.CarContent;

public class Handle {
	// 좌회전
	void left() {
		// 좌회전을 할 때 깜빡이를 키고 끄겠음
		// 단순한 메세지 처리가 아닌
		// 메서드 호출을 통해 처리
		leftLightOn();
		System.out.println("좌회전 실행");
		leftLightOff();
	}
	
	void leftLightOn() {
		System.out.println("좌측 깜박이 on");
	}
	void leftLightOff() {
		System.out.println("좌측 깜박이 off");
	}
	
	// 우회전
	void right() {
		rightLightOn();
		System.out.println("우회전 실행");
		rightLightOff();
	}
	void rightLightOn() {
		System.out.println("우측 깜박이 on");
	}
	void rightLightOff() {
		System.out.println("우측 깜박이 off");
	}
	
	
}
