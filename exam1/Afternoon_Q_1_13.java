package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_13 {

	public static void main(String[] args) {
		
		Scanner cost = new Scanner(System.in);
		
		// 콜라자판기
		// 금액입력
		int money;
		System.out.println("금액을 넣어주세요");
		money = cost.nextInt();
		
		// 콜라는 1000원
		int coke = 1000;
		// 잔액계산
		int change = money - coke;
		
		// 1. 잔액이 부족합니다
		if (change<0) {
			System.out.println("잔액이 부족하여 콜라를 뽑을 수 없습니다");
		} //if end
		// 2. 잔액이 없습니다
		else if (change<=0) {
			System.out.println("잔액이 없습니다");
		} //if end
		// 3. 잔액계산
		else {
			System.out.printf("잔액 %d입니다",change);
		} //if end
		
		
		

	}
	

}
