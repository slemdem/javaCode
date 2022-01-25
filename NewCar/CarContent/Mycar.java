package NewCar.CarContent;

public class Mycar {
	
	// 필드
	// 차 이름
	String name;
	Accel accel;
	Engine engine;
	Handle handle;
	Wheel wheel;
	
	public Mycar(String name) {
		this.name = name;
		this.accel = new Accel(name);
		this.engine = new Engine(name);
		this.handle = new Handle();
		this.wheel = new Wheel("금호타이어");
	}
	
	// 메소드
	// 차 달리기
	public void letsGo() {
		// accel 클래스에서 만들 엑셀 밟기 메서드 호출
		accel.push();
		// wheel 클래스에서 만들 바퀴 움직이기 메서드 호출
		wheel.go();
	}
	// 시동걸기
	public void ready() {
		// engine 클래스에서 만들 시동걸기 메서드 호출
		engine.start();
	}
	// 멈추기
	public void stop() {
		// engine 클래스에서 멈추기 메서드 호출
		engine.off();
	}
	// 좌회전
	public void turnLeft() {
		// handle 클래스에서 좌회전 메서드 호출
		handle.left();
	}
	//우회전
	public void turnRight() {
		// handle 클래스에서 우회전 메서드 호출
		handle.right();
	}
	
	
	
}
