package classExam;

class FishBread {
	public String fishCode;//붕어빵번호
	public String inside; //붕어빵 속
	public String flourCode;//밀가루 원산지 
	
	public void showFish() {
		System.out.println("번호 : " +fishCode+ "재료 : " +
							inside + "원산지 : " + flourCode );
	}
}

public class FishBreadMain {
	public static void main(String[] args) {
		
		FishBread fi = new FishBread();
		
		fi.fishCode = "001";
		fi.inside = "팥";
		fi.flourCode ="미국산";
		
		fi.showFish();
		
		FishBread fi2 = new FishBread();
		
		fi2.fishCode = "002";
		fi2.inside = "슈크림";
		fi2.flourCode ="중국산";
		
		fi2.showFish();
		
		//AvanteBuild라는 파일생성
		// NewAvante라는 클래스
		// 클래스가 가진 맴버 변수
		//배터리
		//속도
		//기름(최대 50L)
		
		//클래스 메서트
		// speedUp
		// 매서드를 호출 할 때마다 해당 인스턴스의 속도 변수의 값 증가
		// speedUp
		// 매서드를 호출 할 시 해당 인스턴스 맴버변수의 정보 확인

	}

}
