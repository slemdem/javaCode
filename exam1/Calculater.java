package exam1;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		
		// ���� �����
		// ���� ��� �ּһ���
		// 1. �ּ� 2�� �̻��� ���ڸ� �Է� ���� ��
		// 2. �Է¹��� 2�� ������ ��Ģ������ �����ؾ� �Ѵ�
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("����");
		System.out.println("ù��° ���ڸ� �Է��ϼ���"); 
		int a = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 
		int b = in.nextInt();
		
		System.out.println("�����");
		System.out.println("���� : " + (a+b));
		//���� ��� ���� 1(����)
		// ���� a�� b ���� ������ b-a�� �����ϼ���
		String calculateSubtract;
		calculateSubtract = ( a - b > 0 ) ? ("���� : " + (a-b)) : ("���� : " + (b-a)) ;
		System.out.println(calculateSubtract);
		System.out.println("���� : " + (a*b));
		//���� ��� ���� 1(����)
		// ���� a�� b ���� ������ b/a�� �����ϼ���
		String calculateDivide;
		calculateDivide = ( a - b > 0 ) ? ("������ : " + (a/b)) : ("������ : " + (b/a)) ;
		System.out.println(calculateDivide);
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("����");
//		System.out.println("ù��° ���ڸ� �Է��ϼ���"); 
//		int num = in.nextInt();
//		System.out.println("��ȣ�� �Է��ϼ���"); 
//		String sign= in.next();
//		System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 
//		int num2 = in.nextInt();
//		  
//		if (sign == "+") { 
//			System.out.println("�μ��� �� : "+(num+num2)); 
//		} else if (sign == "-") {
//			System.out.println("�μ��� �� : "+(num-num2)); 
//		} else if (sign == "*") {
//			System.out.println("�μ��� �� : "+(num*num2)); 
//		} else if (sign == "/") {
//			System.out.println("�μ��� ������ : "+(num/num2)); 
//		} else{
//			System.out.println("����"); 
//		};
		
		
		
	}

	

}
