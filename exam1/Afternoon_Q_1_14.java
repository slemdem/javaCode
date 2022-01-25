package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		// for문을 이용하여 제곱승을 구하시오
//		int x ;
//		int y ;
//		
//		System.out.printf("x의 값을 입력하시오 : ");
//		x = scn.nextInt();
//		System.out.printf("y의 값을 입력하시오 : ");
//		y = scn.nextInt();
//		
//		int result = x;
//		int left = y;
//		
//		for (int i=0;i<left;i++ ) {
//			result*=x;
//			left--;	
//		}
//		System.out.printf(x+"의"+y+"승은 "+result);
		
		
		
		int count=50;
		int[] num;
		num = new int[count];
		
		for(int i=0;i<count;i++) {
			int a = (int)(Math.random()*100);
			num[i] = a;
		}
		System.out.println("--출력--");
		for(int i=0;i<count;i++) {
			System.out.printf(num[i]+"\t");
			if ((i+1)%6==0) {
				System.out.println();
			}
		}
		
		

	}

}
