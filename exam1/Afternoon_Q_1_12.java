package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("당신의 키를 입력하세요");
		float hight = sc.nextFloat();
		System.out.println("당신의 전화번호를 입력하세요");
		String phoneNum = sc.next();
		System.out.println("당신의 몸무게를 입력하세요");
		float weight = sc.nextFloat();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + hight);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("몸무게 : " + weight);
		

	}

}
