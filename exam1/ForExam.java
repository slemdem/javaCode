package exam1;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		
		// for + 배열 ->숫자 입력받아 출력하기
		
		// 1. 배열의 크리를 사용자에게 입력
		// 2. 배열의 크기만큼 숫자를 배열에 삽임
		// 3. 배열에 들어있는 숫자 검색
		
		//필요한 변수
		// 입력받을 숫자의 개수 변수
		int count = 0;
		// 입력받을 배열
		int[] num;
		// 겁색할 숫자
		int findNum = 0;
		
		Scanner scn = new Scanner (System.in);
		
		// 1. 배열의 크리를 사용자에게 입력
		System.out.println("입력할 숫자의 개수를 입력하세요");
		count = scn.nextInt();
		num = new int[count];
		
		// 2. 배열의 크기만큼 숫자를 배열에 삽임
		for (int i = 0; i<count; i++) {
			System.out.println("숫자를 입력하세요");
			num[i] = scn.nextInt();
		}
		
		// 3. 배열에 들어있는 숫자 검색
		boolean chk = false;
		System.out.println("검색할 숫자 ? :");
		findNum = scn.nextInt();
		
		for (int i = 0; i<count; i++) {
			
			if ( findNum == num[i]) {
				chk = true;
				System.out.printf(findNum + "의 위치는 "+(i+1)+ "번째 입니다");
			}
		}
		 if (!chk) {
				System.out.printf(findNum + "는 존재하지 않습니다");
			}

	}

}
