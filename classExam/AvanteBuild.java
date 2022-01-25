package classExam;

class NewAvante {
	public float battery;//배터리
	public float speed; //속도
	public float fuel; //기름(최대 50L)
	
	public void speedUp() {
		speed+=10;
	}
	
	public void showCar() {
		float realFuel = ((float)(fuel)<=50) ? (realFuel=fuel) : 50;
		System.out.println("배터리 : " +battery+ "\t 속도 : " +
				speed + "km \t기름 : " + realFuel +"L");
	}
}

public class AvanteBuild {

	public static void main(String[] args) {
		//AvanteBuild라는 파일생성
		// NewAvante라는 클래스
		// 클래스가 가진 맴버 변수
		//배터리
		//속도
		//기름(최대 50L)
		
		//클래스 메서트
		// speedUp
		// 매서드를 호출 할 때마다 해당 인스턴스의 속도 변수의 값 증가
		// showCar
		// 매서드를 호출 할 시 해당 인스턴스 맴버변수의 정보 확인
		
		NewAvante a = new NewAvante();
		a.battery = 30;
		a.speed = 130;
		a.fuel =60;
		
		a.speedUp();
		a.showCar();
	}

}
