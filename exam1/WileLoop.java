package exam1;

import java.util.Scanner;

public class WileLoop {

	public static void main(String[] args) {
		// �ݺ���
		// ���α׷� ������ �Ȱ��� ����� ���� Ƚ���� �ݺ��Ͽ� �����ϵ��� 
		// �����ϴ� ��ɹ�
		// ���α׷��� ó���ϴ� ��κ��� �ڵ�� �ݺ����� ���°� ����
		// ���� ���� ����ϴ� ���
		// 1, while��
		// 2, do/while��
		// 3, for��
		// 4, Enhenced for��
		
		// �ݺ��� ��¥ �ʿ��Ѱ�?
		// �ݺ����� ���� ���ʿ��� �۾��� �ּ�ȭ �� �� ����
		
		// while
		// Ư���� ������ ������ ������ ����ؼ� �־��� ��ɹ��� �ݺ� ����
		
//		while(���ǽ�) {
//			���ǽ��� ����� ���ε��� �ݺ������� �����ϰ��� �ϴ� ��ɹ�
//		}
		
		//while �� ���� ���ǻ���
		//���� ������ ���� ���� ��� �����ϴ� �ݺ����̱� ������
		//���� ���������� ��Ȯ���� �ʴٸ� ���� ���� �ݺ�
		//while�� ���ÿ��� �ݵ�� ���������� �� �޾� �־�� �Ѵ�
		
		//while���� �������� �ο����
		// while���� ��Ʈ�� �� ������ �����ϰ�
		// �� ������ ���� �ݺ����� �������Ѽ� �ᱹ���� false ������ ������ �� �ֵ��� ó��
		
//		int a = 0;
//		while (a<10) {
//			a++;
//			System.out.printf("������ %d",a);
//			System.out.println();
//		}//while end
//		
//		
//		while (true) {
//			System.out.printf("������ %d",a);
//			System.out.println();
//			
//			if (a==10) {
//				break;
//			}//if end 10�� �� a++���� �ȵ� while�� ��ü�� ����
//			a++;
//		}//while end
//		System.out.println("���� a�� ��"+a);
		
		// while���� ����
		// ������ �Ϸ����!(Ŀ�� Ÿ����)
		// �Ϸ��� Ŀ�Ǽ��� 5���� �����ϰ�
		// ���� Ŀ�ǰ� �� �ȸ��� ���α׷��� ����
		// Ŀ�ǰ� �� �ȷ��� �� �� ���� ���� ���� ����� ���
		
		Scanner s = new Scanner(System.in);
//		int coffee = 5;
//		int money;
//		int result = 0;
//		
//		while (coffee>0) {
//			System.out.println("�մ��� �Խ��ϴ�. Ŀ�Ǹ� �󸶿� �Ľðڽ��ϱ�?");
//			money= s.nextInt();
//			coffee--;
//			System.out.println("���� Ŀ���� ���� "+coffee+"�� �Դϴ�");
//			result += money;
//		}
//		
//		System.out.println("���� ���� �ݾ� : "+(result));
		
		//����) ������ �Է¹޾� 80�� �̻��̸� �հݸ޼�����
		//�׷��� ������ ���հ� �޼����� ����ϴ� �۾��� �ݺ��ϴٰ�
		//0~100 �̿��� ������ �ԷµǸ� �����ϴ� ���α׷��� �ۼ�
		
		int score = 0;
		
		while (0<=score && score<=100) {
			System.out.println("������ �Է��ϼ���");
			score = s.nextInt();
			
			if (0<=score && score<80) {
			 System.out.println("�����Դϴ� ���հ��Դϴ�");
			} else if (80<=score && score<=100){
			 System.out.println("�հ��� �����մϴ�");
			}//if end
		 
		}
		System.out.println("���α׷��� �����մϴ�");
		
	}

}
