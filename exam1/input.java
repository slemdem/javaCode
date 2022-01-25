package exam1;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// input
		// 지금까지 데이터를 사용하려면?
		// 변수로 입력받아 해당 변수의 내용에서 처리
		// 하지만 Scanner 클래스를 이용해서 프로그램 사용자로 부터 대이터를 
		// 입력 받는 것도 가능하다
		
		// Scanner 메서드 정리
		// boolean : nextBoolean()
		// byte : nextByte()
		// Short : nextShort()
		// int : nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : next(),nextLine()
		
		
		
		Scanner in = new Scanner(System.in);
		
		//next, nextLine 메서드를 이용해서 사용자로부터 데이터를 입력받음
		// next() : 공백 전까지의 문자를 입력받음
		// nextLine() : 입력한 문자 전체를 입력받음(개행(엔터)을 기준으로 처리)
		//String test = in.next();
		//String test2 = in.nextLine();
		
		//System.out.println(test);
		//System.out.println(test2);
		
		// 숫자입력
		System.out.println("두 수의 합을 구합니다");
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num = in.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요");
		int num2 = in.nextInt();

		System.out.println("두수의 합 : "+(num+num2));
		
		// sum = num+num2;
		
		//System.out.println("두수의 합 : "+sum);
		
		//System.out.printf("두수의 합 : ");
		//System.out.println(num+num2);
		
		
	}

}
