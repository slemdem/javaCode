package exam1;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// input
		// ���ݱ��� �����͸� ����Ϸ���?
		// ������ �Է¹޾� �ش� ������ ���뿡�� ó��
		// ������ Scanner Ŭ������ �̿��ؼ� ���α׷� ����ڷ� ���� �����͸� 
		// �Է� �޴� �͵� �����ϴ�
		
		// Scanner �޼��� ����
		// boolean : nextBoolean()
		// byte : nextByte()
		// Short : nextShort()
		// int : nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : next(),nextLine()
		
		
		
		Scanner in = new Scanner(System.in);
		
		//next, nextLine �޼��带 �̿��ؼ� ����ڷκ��� �����͸� �Է¹���
		// next() : ���� �������� ���ڸ� �Է¹���
		// nextLine() : �Է��� ���� ��ü�� �Է¹���(����(����)�� �������� ó��)
		//String test = in.next();
		//String test2 = in.nextLine();
		
		//System.out.println(test);
		//System.out.println(test2);
		
		// �����Է�
		System.out.println("�� ���� ���� ���մϴ�");
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		int num = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		int num2 = in.nextInt();

		System.out.println("�μ��� �� : "+(num+num2));
		
		// sum = num+num2;
		
		//System.out.println("�μ��� �� : "+sum);
		
		//System.out.printf("�μ��� �� : ");
		//System.out.println(num+num2);
		
		
	}

}
