package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_13 {

	public static void main(String[] args) {
		
		Scanner cost = new Scanner(System.in);
		
		// �ݶ����Ǳ�
		// �ݾ��Է�
		int money;
		System.out.println("�ݾ��� �־��ּ���");
		money = cost.nextInt();
		
		// �ݶ�� 1000��
		int coke = 1000;
		// �ܾװ��
		int change = money - coke;
		
		// 1. �ܾ��� �����մϴ�
		if (change<0) {
			System.out.println("�ܾ��� �����Ͽ� �ݶ� ���� �� �����ϴ�");
		} //if end
		// 2. �ܾ��� �����ϴ�
		else if (change<=0) {
			System.out.println("�ܾ��� �����ϴ�");
		} //if end
		// 3. �ܾװ��
		else {
			System.out.printf("�ܾ� %d�Դϴ�",change);
		} //if end
		
		
		

	}
	

}
