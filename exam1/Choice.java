package exam1;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// 제어문
		// 프로그램의 순차적인 흐름을 제어하는 방법
		// -> 순차적 흐름을 제어하고 이때 명령문을 통해 제어
		// 제어문 : 조건문, 반복문
		
		// 제어문에 속하는 명령문들은 중괄호로 둘러쌓여져 있음
		// 중괄호 영역을 블록이라 칭함
		
		// 조건문
		// 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문
		// if~ else / switch
		
		// if문
		//if (조건식) {
		//	  조건이 참일 때 실행하는 코드
		//  }
		
		// 조건생성
		
		// 새벽까지 술을 마시고 택시를 타고 집에 가려는데
		// 잔액이 3만원 이상이면 택시를 타고 그렇지 않으면 걸어간다.
//		int money = 35000;
//		if (money >= 30000) {
//			System.out.println("택시타고 집에 가는 중!");
//		} else {
//			System.out.println("돈없어서 걸어가는 중ㅜㅜ");
//		};
		
		//문제
		// 재산에 따라 세금을 부여하는 프로그램을 작성하세요
		// 1. 재산이 100만원 이상이면 세금을 10만원을 납부
		// 2. 그렇지 않으면 세금을 2만원을 납부.

//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("재산을 입력하세요");
//		int tax = in.nextInt(); // 재산 내용 저장
//		
//		if (tax >= 1000000) {
//			System.out.println("10만원을 납부하세요");
//		} else {
//			System.out.println("2만원을 납부하세요");
//		}
		
		// 조건을 문자로 처리
		// 초등학생, 중학생, 고등학생, 대학생
//		String stu1 = "고등학생";
//		
//		if(stu1=="고등학생") {
//			System.out.println("청담고등학교로 가고 있습니다");
//		} 
		
		// 여러개의 조건을 가지는 조건문(else if)
		// 나이별 요금 계산 프로그램
		// 코드에 필요한 것들
		// 정수형 변수(나이, 요금)
//		int age, charge;
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("강남식당에 오신 것을 환영합니다. 나이가 어떻게 되세요?");
//		age = sc.nextInt();
//		
		// 조건 
		// 1. 0~6세는 요금을 받지 않는다
//		if(0<age && age<=6) {
//			System.out.println("6세까지는 요금을 받지 않습니다");
//		}//유아 조건문 종료 블록
		// 2. 6~12살 미취학 아동으로 분류 요금은 5000원을 받는다
//		else if(age<= 12) {
	//		System.out.println("미취학 아동입니다 요금은 5000원입니다");
	//	}//미취학아동 조건문 종료 블록	
		// 3. 19세는 청소년으로 분류 요금 10000원을 받는다.
//		else if(age<= 19) {
//			System.out.println("청소년입니다 요금은 10000원입니다");
//		}//청소년 조건문 종료 블록
		// 4. 20세 이상부터는 성인으로 분류 요금 15000원을 받는다
//		else if(age>19) {
//			System.out.println("성인입니다 요금은 15000원입니다"); 
//		}//성인 조건문 종료 블록
//		else {
//			System.out.println("잘못된 값입니다");
//		}//조건문 종료
		
		//실습문제
		// 값을 입력받고 값이 0~100 사이면
		// 입력받은 값은 '입력받은 값' 입니다. 를 출력하고
		// 100보다 큰 경우는 너무 큰 값을 입력하셨습니다 를 출력
		// 0보다 작은 수는 음수는 입력받을 수 없습니다 출력
		
		// 문제해결 ROADMAP
		// 1. 0을 기준으로 움직인다
		//		- 0보다 작은 경우, 0~100 사이, 100 이상
		
		// 값을 입력받을 변수 설정(입력받을 값이 정수)
		int num;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력해 주세요");
		num = scn.nextInt();
		
		// 1. 0보다 작은 경우
		if(num<0) {
			System.out.println("음수는 입력받을 수 없습니다");
		}// if end
		// 2. 0~100사이
		else if(0<=num && num<=100) {
			System.out.printf("입력받은 값은 '%d'입니다.", num);
		}// if end
		// 3. 100 초과
		else if(num>100) {
			System.out.println("너무 큰 값을 입력하셨습니다");
		}// if end
		
		else {
			System.out.println("오류");
		}//조건문 종료
			
		
		
		
		
	}

}
