package classExam;

import java.util.Scanner;

public class Function {
	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	//1부터 넘어온 파라미터까지의 합을 계산하는 함수
	//100 -> 결과값으로 5050
	
	public static int calSum(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
				
	}
	
	public static int mulNum(int a, int b) {
		int mul = a*b;
		return mul;			
	}
	
	
	public static void main(String[] args) {
		
		// 문제 
		// 파라미터를 정수형으로 2개를 입력받아 
		// 입력받은 수의 곱을 출력하는
		// mulNum 함수
		int result2= mulNum(1, 4);
		System.out.println(result2);
		
		Scanner sc = new Scanner(System.in);
		// 두 수의 합을 구하는 함수
		// 인수(argument)		 = 값, 변수, 참조 등 함수로 전달되는 값
		// 매개변수(parameter) = 함수, 메서드에서 
		String hello = "안녕하소";
		
		sayHi(hello);//변수 hello는 함수 sayHi로 전달될 인수
		sayHi("모르겠네..");
		
		int result = calSum(6);
		System.out.println(result);
		
		


		
		

				
	}

}
