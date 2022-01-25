package classExam;

//1.Phone 클래스를 상속받는 SmartPhone 클래스 생성
//
//2. Phone 클래스의 기본 필드는 모델명과 색상
//    - 아래의 기능은 메세지로 처리한다(필드선언이 아닌)
//    - 기능은 전원 키기, 끄기
//    - 벨울리기
//    - 전화하기
//    - 전화종료하기
class Phone {
	public String model;
	public String color;
	
	public Phone(String model , String color) {
		this.model = model;
		this.color = color;
	}
	
	public void turnOn() {
		System.out.println( model+" 전원 켜짐");
	}
	public void turnOff() {
		System.out.println( model+" 전원 꺼짐");
	}
	public void bell() {
		System.out.println("또-루루루루-");
	}
	public void callOn() {
		System.out.println("전화 중...");
	}
	public void callOff() {
		System.out.println("전화 종료");
	}
}

//3. SmartPhone 클래스(phone 클래스의 필드를 사용해야함)
class SmartPhone extends Phone{
	public String browser;
	public SmartPhone(String model, String color, String browser) {
		super(model, color);
		this.browser=browser;
	}//-  브라우저 실행(필드)
	
	public void brouseAct() {
		System.out.println(browser+" 실행 중");
	}//- 기능은 인터넷 실행하기
	public void kakaoAct() {
		System.out.println("카카오톡 실행 중");
	}//- 카카오톡 실행하기
	public void showStaitus() {
		System.out.println("모델 : "+model+ "\t색상 : "+color+ "\t브라우저 : "+ browser);
	}
}

public class lunchquiz0118 {

	public static void main(String[] args) {
		 Phone iphone = new SmartPhone("iphoneX", "흰 색", "Safari");
		 
		 SmartPhone galaxy = new SmartPhone("gal 10e", "검정 색", "Crome");
		 
		 iphone.turnOn();
		 ((SmartPhone) iphone).brouseAct();
		 ((SmartPhone) iphone).showStaitus();
		 iphone.turnOff();
		 
		 galaxy.turnOn();
		 galaxy.bell();
		 galaxy.showStaitus();
		 galaxy.turnOff();
		 
	}

}
