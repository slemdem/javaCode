package exam1;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		
		// 계산기 만들기
		// 계산기 기능 최소사항
		// 1. 최소 2개 이사의 숫자를 입력 받을 것
		// 2. 입력받은 2개 숫자의 사칙연산이 가능해야 한다
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("계산기");
		System.out.println("첫번째 숫자를 입력하세요"); 
		int a = in.nextInt();
		System.out.println("두번째 숫자를 입력하세요"); 
		int b = in.nextInt();
		
		System.out.println("계산결과");
		System.out.println("덧셈 : " + (a+b));
		//계산기 기능 개조 1(문제)
		// 만약 a가 b 보다 작으면 b-a로 진행하세요
		String calculateSubtract;
		calculateSubtract = ( a - b > 0 ) ? ("뺄셈 : " + (a-b)) : ("뺄셈 : " + (b-a)) ;
		System.out.println(calculateSubtract);
		System.out.println("곱셈 : " + (a*b));
		//계산기 기능 개조 1(문제)
		// 만약 a가 b 보다 작으면 b/a로 진행하세요
		String calculateDivide;
		calculateDivide = ( a - b > 0 ) ? ("나눗셈 : " + (a/b)) : ("나눗셈 : " + (b/a)) ;
		System.out.println(calculateDivide);
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("계산기");
//		System.out.println("첫번째 숫자를 입력하세요"); 
//		int num = in.nextInt();
//		System.out.println("부호를 입력하세요"); 
//		String sign= in.next();
//		System.out.println("두번째 숫자를 입력하세요"); 
//		int num2 = in.nextInt();
//		  
//		if (sign == "+") { 
//			System.out.println("두수의 합 : "+(num+num2)); 
//		} else if (sign == "-") {
//			System.out.println("두수의 차 : "+(num-num2)); 
//		} else if (sign == "*") {
//			System.out.println("두수의 곱 : "+(num*num2)); 
//		} else if (sign == "/") {
//			System.out.println("두수의 나누셈 : "+(num/num2)); 
//		} else{
//			System.out.println("오류"); 
//		};
		
		
		
	}

	

}
