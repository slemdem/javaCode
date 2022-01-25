package exam1;

public class For {

	public static void main(String[] args) {
		
		// for문
		// 반복문의 일종, while문과 다르게
		// 반복문 시작시 조건을 세부적으로 지정후 진행하는 문법
		
		// for (초기식; 조건식; 증감식){
		//
		//}
		
		//10번 찍어서 안넘어가는 나무 없다
//		int tree = 0;
//		
//		for (int i=1; i<=10; i++) {
//			System.out.println("나무를 도끼로 "+i+"번째 찍었습니다");
//		}
//		
		// while vs do-while vs for
		// 각각 어느 때에 쓰이면 유리한가?
		// while : 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할 때
		// do-while : 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할 때
		// for : 특정 수의 범위, 횟수와 관련하여 반복될 때 사용, 배열과 궁합이 좋음
		
		//for문의 초기식 조건식 증감식은 생략가능
//		int tree = 0;
//		int i=0;
//		for (;;) {
//			i++;
//			System.out.println("나무를 도끼로 "+i+"번째 찍었습니다");
//		}
		
		// for문 사용예시2
		// 1~10까지 더하되 짝수 제외
		
//		int result=0;
//		
//		for (int i = 1; i<=10; i++) {
////			if (i%2 == 1) {
////				result += i;
////			}
//			if (i%2 == 0) {
//				// continue : 해당 키워드를 만날 시 반복문의 처음으로 되돌아가는 키워드
//				// 상황에 따라 반복을 수행하고 싶지 않다면 사용하는 키워드
//				continue;
//			}
//			result += i;
//			
//		}
//		System.out.println(result);
		
		// for문의 응용
		// 구구단
		
//		int n = 3;
//		
//		for (int i2 = 1; i2<10; i2++) {
//			System.out.println(n+" * "+i2+" = "+(n*i2));
//		}
		
		// for문의 중첩 (이중 for문)
		// for문 안에 for문을 한번 더 사용 할 수 있음
		// 2단부터 9단까지
		for (int i3 = 2; i3<10; i3++) {
			for (int j = 1; j<10; j++) {
				System.out.println(i3+" * "+j+" = "+(j*i3));
			}
		}
		
		//배열과 입력을 같이눠
		
		
		
	}

}
