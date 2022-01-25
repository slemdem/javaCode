package exam1;

import java.util.Scanner;

public class Calculater_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("계산기 입니다");
		System.out.println("첫번째 숫자를 입력하세요"); 
		float num1 = in.nextFloat();
		System.out.println("두번째 숫자를 입력하세요"); 
		float num2 = in.nextFloat();
		// 부호입력과 아스키코드 전환
		System.out.println("부호를 입력하세요"); 
		String sign= in.next();
		int signNo = sign.charAt(0);
		// = char sign= in.next().charAt(0);
		
		System.out.println("계산결과");
		switch(signNo) {
			case 43:
				System.out.println("계산결과");
				System.out.println("덧셈 : "+(num1+num2)); 
				break;
			case 45:
				System.out.println("계산결과");
				System.out.println("뺄셈 : "+(num1-num2)); 
				break;
			case 42:
				System.out.println("계산결과");
				System.out.println("곱셈 : "+(num1*num2));
				break;
			case 47:
				System.out.println("계산결과");
				System.out.println("나눗셈 : "+(num1/num2));
				break;
			default:
				System.out.println("해당 연산은 수행할 수 없습니다"); 
				break;
		}
		
		
		// +일때
//		if (signNo == 43) { 
//			System.out.println("두수의 합 : "+(num1+num2)); 
//		} //if end
		// -일때
//		else if (signNo == 45) {
//			System.out.println("두수의 차 : "+(num1-num2)); 
//		}  //if end
		// *일때
//		else if (signNo == 42) {
//			System.out.println("두수의 곱 : "+(num1*num2)); 
//		} //if end
		// /일때
//		else if (signNo == 47) {
//			System.out.println("두수의 나누셈 : "+(num1/num2)); 
//		}  //if end
		// 연산 오류
//		else{
//			System.out.println("해당연산은 수행할 수 없습니다"); 
//		} //if end
	}

}
