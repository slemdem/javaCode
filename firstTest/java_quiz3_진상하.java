package firstTest;

import java.util.Scanner;

public class java_quiz3_진상하 {
	public static double area;
	public static double PI = 3.141592;
	static Scanner scn = new Scanner(System.in);
	public static double n1;
	public static double n2;
	public static double n3;
	
	//area 초기화
	public static void reset() {
		area=0;
	}
	
	//도형의 조건 입력&계산
	public static void triangle(){
		reset();
		System.out.println("**** 삼각형의 넓이 ***");
		System.out.printf("밑변 : ");
		n1 = scn.nextInt();
		System.out.printf("높이 : ");
		n2 = scn.nextInt();
		area = n1*n2/2;
		
		output(area);
	}
	public static void circle(){
		reset();
		System.out.println("**** 원의 넓이 ***");
		System.out.printf("반지름 : ");
		n1 = scn.nextInt();
		area = n1*PI;
		
		output(area);
	}
	public static void trape(){
		reset();
		System.out.println("**** 사다리꼴의 넓이 ***");
		System.out.printf("아랫변 : ");
		n1 = scn.nextInt();
		System.out.printf("윗변 : ");
		n2 = scn.nextInt();
		System.out.printf("높이 : ");
		n3 = scn.nextInt();
		area = (n1+n2)/2*n2;
		
		output(area);
	}
	
	//출력함수
	public static void output(double a) {
		System.out.printf("넓이 : ");
		System.out.println(a);
		
	}
	
	public static void int_menu() {
		System.out.println("**** 도형선택 ****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		System.out.printf("선택 : ");
		int a;
		a = scn.nextInt();
		System.out.println();
		
		if (a==1) {
			triangle();
		}
		else if (a==2) {
			circle();
		}
		else if (a==3) {
			trape();
		}
		else if (a==4) {
			System.out.println("종료합니다");
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
		
	}
	

	public static void main(String[] args) {
		int_menu();
	}

}
