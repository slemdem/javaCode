package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		// for���� �̿��Ͽ� �������� ���Ͻÿ�
//		int x ;
//		int y ;
//		
//		System.out.printf("x�� ���� �Է��Ͻÿ� : ");
//		x = scn.nextInt();
//		System.out.printf("y�� ���� �Է��Ͻÿ� : ");
//		y = scn.nextInt();
//		
//		int result = x;
//		int left = y;
//		
//		for (int i=0;i<left;i++ ) {
//			result*=x;
//			left--;	
//		}
//		System.out.printf(x+"��"+y+"���� "+result);
		
		
		
		int count=50;
		int[] num;
		num = new int[count];
		
		for(int i=0;i<count;i++) {
			int a = (int)(Math.random()*100);
			num[i] = a;
		}
		System.out.println("--���--");
		for(int i=0;i<count;i++) {
			System.out.printf(num[i]+"\t");
			if ((i+1)%6==0) {
				System.out.println();
			}
		}
		
		

	}

}
