package exam1;

import java.util.Scanner;

public class Calculater_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Դϴ�");
		System.out.println("ù��° ���ڸ� �Է��ϼ���"); 
		float num1 = in.nextFloat();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 
		float num2 = in.nextFloat();
		// ��ȣ�Է°� �ƽ�Ű�ڵ� ��ȯ
		System.out.println("��ȣ�� �Է��ϼ���"); 
		String sign= in.next();
		int signNo = sign.charAt(0);
		// = char sign= in.next().charAt(0);
		
		System.out.println("�����");
		switch(signNo) {
			case 43:
				System.out.println("�����");
				System.out.println("���� : "+(num1+num2)); 
				break;
			case 45:
				System.out.println("�����");
				System.out.println("���� : "+(num1-num2)); 
				break;
			case 42:
				System.out.println("�����");
				System.out.println("���� : "+(num1*num2));
				break;
			case 47:
				System.out.println("�����");
				System.out.println("������ : "+(num1/num2));
				break;
			default:
				System.out.println("�ش� ������ ������ �� �����ϴ�"); 
				break;
		}
		
		
		// +�϶�
//		if (signNo == 43) { 
//			System.out.println("�μ��� �� : "+(num1+num2)); 
//		} //if end
		// -�϶�
//		else if (signNo == 45) {
//			System.out.println("�μ��� �� : "+(num1-num2)); 
//		}  //if end
		// *�϶�
//		else if (signNo == 42) {
//			System.out.println("�μ��� �� : "+(num1*num2)); 
//		} //if end
		// /�϶�
//		else if (signNo == 47) {
//			System.out.println("�μ��� ������ : "+(num1/num2)); 
//		}  //if end
		// ���� ����
//		else{
//			System.out.println("�ش翬���� ������ �� �����ϴ�"); 
//		} //if end
	}

}
