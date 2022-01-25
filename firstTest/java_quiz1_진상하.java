package firstTest;

import java.util.Random;
import java.util.Scanner;


public class java_quiz1_진상하 {

	public static void main(String[] args) {
		
		// 난수 발생
        Random a = new Random();
        int b = a.nextInt(25); 
        int input;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("0~25의 난수가 발생하였습니다.맞추어 보세요.");
        
        //숫자를 맞추는 게임
      	for(;;) {
      		System.out.printf("숫자 입력 :");
      		input=scn.nextInt();
      		
      		//성공
      		if(input == b) {
      				break;
      		} // 실패
      		else if (input != b) {
      			System.out.println("틀렸습니다 다시 입력하세요");
      		}//if end
      			
      	}//for end
      		
      	System.out.printf("정답을 맞추셨습니다");

	}

}
