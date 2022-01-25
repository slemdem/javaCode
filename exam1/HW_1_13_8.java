package exam1;

import java.util.Scanner;

public class HW_1_13_8 {

	public static void main(String[] args) {
		
//		문제8
//		[이 문제는 다음주 월요일까지 풀어보세요]
//		 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램을 작성하세요
//		     난수발생) 1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
//		                   2. ① import java.util.Random;
//		                      ② Random 변수1 = new Random();
//		                      ③ int 변수2 = 변수1.nextInt(최대값); 
//		                               ==>  0 ~ (최대값 - 1)사이의 임의의 수
		
		Scanner scn = new Scanner(System.in);
		
		//난수를 발생
		int a = (int)(Math.random()*100);
		int input;
		int counter=0;
		
		System.out.println("*** 난수가 발생하였습니다...맞추어 보세요...***");
		
		//숫자를 맞추는 게임
		for(;;) {
			System.out.printf("숫자 입력 :");
			input=scn.nextInt();
			counter+=1;
			
			//성공
			if(input == a) {
				break;
			} 
			// 실패
			else if (input < a) {
				System.out.println("컴퓨터의 숫자가 더 큽니다..");
			} else if (input > a) {
				System.out.println("컴퓨터의 숫자가 더 작습니다..");
			}//if end
			
		}//for end
		
		System.out.printf("추카추카...%d번만에 맞추셨습니다...",counter);
		

	}

}
