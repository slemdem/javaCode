package exam1;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		
		// for + �迭 ->���� �Է¹޾� ����ϱ�
		
		// 1. �迭�� ũ���� ����ڿ��� �Է�
		// 2. �迭�� ũ�⸸ŭ ���ڸ� �迭�� ����
		// 3. �迭�� ����ִ� ���� �˻�
		
		//�ʿ��� ����
		// �Է¹��� ������ ���� ����
		int count = 0;
		// �Է¹��� �迭
		int[] num;
		// �̻��� ����
		int findNum = 0;
		
		Scanner scn = new Scanner (System.in);
		
		// 1. �迭�� ũ���� ����ڿ��� �Է�
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		count = scn.nextInt();
		num = new int[count];
		
		// 2. �迭�� ũ�⸸ŭ ���ڸ� �迭�� ����
		for (int i = 0; i<count; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			num[i] = scn.nextInt();
		}
		
		// 3. �迭�� ����ִ� ���� �˻�
		boolean chk = false;
		System.out.println("�˻��� ���� ? :");
		findNum = scn.nextInt();
		
		for (int i = 0; i<count; i++) {
			
			if ( findNum == num[i]) {
				chk = true;
				System.out.printf(findNum + "�� ��ġ�� "+(i+1)+ "��° �Դϴ�");
			}
		}
		 if (!chk) {
				System.out.printf(findNum + "�� �������� �ʽ��ϴ�");
			}

	}

}
