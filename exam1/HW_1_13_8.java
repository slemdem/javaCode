package exam1;

import java.util.Scanner;

public class HW_1_13_8 {

	public static void main(String[] args) {
		
//		����8
//		[�� ������ ������ �����ϱ��� Ǯ�����]
//		 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷��� �ۼ��ϼ���
//		     �����߻�) 1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
//		                   2. �� import java.util.Random;
//		                      �� Random ����1 = new Random();
//		                      �� int ����2 = ����1.nextInt(�ִ밪); 
//		                               ==>  0 ~ (�ִ밪 - 1)������ ������ ��
		
		Scanner scn = new Scanner(System.in);
		
		//������ �߻�
		int a = (int)(Math.random()*100);
		int input;
		int counter=0;
		
		System.out.println("*** ������ �߻��Ͽ����ϴ�...���߾� ������...***");
		
		//���ڸ� ���ߴ� ����
		for(;;) {
			System.out.printf("���� �Է� :");
			input=scn.nextInt();
			counter+=1;
			
			//����
			if(input == a) {
				break;
			} 
			// ����
			else if (input < a) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�..");
			} else if (input > a) {
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�..");
			}//if end
			
		}//for end
		
		System.out.printf("��ī��ī...%d������ ���߼̽��ϴ�...",counter);
		

	}

}
