package classExam;
	//문제
	// 붕어빵을 만드는 Fish bread Up 클래스 생성
	// 메인 클래스 이름은 FishMain
	
	// Fish Bread Up 클래스에서 클래스변수 문자형 함수 cream을 선언
	
	// Fish Bread Up 클래스를 통해 인스턴스를 마음껏 생성해 보세요
	// 생성한 인스턴스를 통해 cream 필드를 태워넣고
	// 만들고 싶은 붕어빵을 만드세요

class FishBreadUp {
	
	static String bread = "붕어빵";
	public String cream;
	
	//파라미터는 일치하거나 연관있는 단어로 구성하는 게 좋음
	FishBreadUp(String cream) {
		this.cream = cream;
	}
	
	public void eatFishBread() {
		System.out.println(bread + "안에는 "+cream +"이(가) 들어있었다!");
	}
	
}

public class FishMain {

	public static void main(String[] args) {
		FishBreadUp redbean = new FishBreadUp("팥");
		FishBreadUp custard = new FishBreadUp("슈크림");
		FishBreadUp mint = new FishBreadUp("민트");
		redbean.eatFishBread();
		custard.eatFishBread();
		mint.eatFishBread();
		

	}

}
