package classExam;

import interFaceExam.Doggy2;
import interFaceExam.Samoade;

public class InterFaceExam {

	public static void main(String[] args) {
		// interface : 추상화를 좀 더 구체적으로 도움을 주는 도구
		//				실무에서 굉장히 많이 사용하는 방식
		Doggy2 dog4 = new Samoade("왈랄랄루");
		dog4.eat();
		
		System.out.println(Doggy2.getcolor());
		System.out.println(Samoade.getName());
	}

}
