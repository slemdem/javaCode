package exam1;

import java.util.Scanner;

public class WileLoop {

	public static void main(String[] args) {
		// 반복문
		// 프로그램 내에서 똑같은 명령을 일정 횟수를 반복하여 수행하도록 
		// 제어하는 명령문
		// 프로그램이 처리하는 대부분의 코드는 반복적이 형태가 많음
		// 가장 많이 사용하는 제어문
		// 1, while문
		// 2, do/while문
		// 3, for문
		// 4, Enhenced for문
		
		// 반복문 진짜 필요한가?
		// 반복문을 통해 불필요한 작업을 최소화 할 수 있음
		
		// while
		// 특정한 조건을 만족할 때까지 계속해서 주어진 명령문을 반복 실행
		
//		while(조건식) {
//			조건식의 결과가 참인동안 반복적으로 실행하고자 하는 명령문
//		}
		
		//while 문 사용시 주의사항
		//문은 조건이 참인 동안 계속 수앻하는 반복문이기 때문에
		//만약 종료지점이 명확하지 않다면 끝도 없이 반복
		//while문 사용시에는 반드시 종료조건을 잘 달아 주어야 한다
		
		//while문의 종료조건 부여방법
		// while문을 컨트롤 할 변수를 선언하고
		// 그 변수의 값을 반복마다 증가시켜서 결국에는 false 조건을 만족할 수 있도록 처리
		
//		int a = 0;
//		while (a<10) {
//			a++;
//			System.out.printf("실행중 %d",a);
//			System.out.println();
//		}//while end
//		
//		
//		while (true) {
//			System.out.printf("실행중 %d",a);
//			System.out.println();
//			
//			if (a==10) {
//				break;
//			}//if end 10일 때 a++실행 안됨 while문 자체를 중지
//			a++;
//		}//while end
//		System.out.println("변수 a의 값"+a);
		
		// while문의 응용
		// 가게의 하루장사!(커피 타이쿤)
		// 하루의 커피수량 5개로 가정하고
		// 만약 커피가 다 팔리면 프로그램을 종료
		// 커피가 다 팔렸을 때 그 날의 최종 정산 결과를 출력
		
		Scanner s = new Scanner(System.in);
//		int coffee = 5;
//		int money;
//		int result = 0;
//		
//		while (coffee>0) {
//			System.out.println("손님이 왔습니다. 커피를 얼마에 파시겠습니까?");
//			money= s.nextInt();
//			coffee--;
//			System.out.println("남은 커피의 수는 "+coffee+"개 입니다");
//			result += money;
//		}
//		
//		System.out.println("최종 정산 금액 : "+(result));
		
		//문제) 점수를 입력받아 80점 이상이면 합격메세지를
		//그렇지 않으면 불합격 메세지를 출력하는 작업을 반복하다가
		//0~100 이외의 점수가 입력되면 종료하는 프로그램을 작성
		
		int score = 0;
		
		while (0<=score && score<=100) {
			System.out.println("점수를 입력하세요");
			score = s.nextInt();
			
			if (0<=score && score<80) {
			 System.out.println("유감입니다 불합격입니다");
			} else if (80<=score && score<=100){
			 System.out.println("합격을 축하합니다");
			}//if end
		 
		}
		System.out.println("프로그램을 종료합니다");
		
	}

}
