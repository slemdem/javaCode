package exam1;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������(����ȯ)
		// ���δٸ� �ڷ����� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��
		
		// ������ �� ��ȯ(�ڵ� �� ��ȯ)
		String test1 = "result :";
		
		int a = 10;
		int b = 20;
//		
		// �ڵ����� ���ڿ��� ��ȯ�Ǿ� ��� ��
//		System.out.println(test1+a+b);
		
		
		// ����� �� ��ȯ(���� �� ��ȯ)
		System.out.println(test1+(int)(a+b));
		
		String num = "1234";
		//int test = num; //������ ����ȯ�� ����ϰ� �ٷ� ������ ���� �־������ ����
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		
		//������ �����͸� ���������� �ٲٱ�
		
		//1. �ڵ����� ��ȯ 
//		int n = 123;
//		String a = ""+n;
		 		
		// 2. �޼ҵ�� ��ȯ
//		int n = 123;
//		String a = String.valueOf(n);
//		String b = Integer.toString(n);
		
		// �Ǽ��� �߰����� & Ÿ�Ժ�ȯ
		// �ֱ� �Ǽ�Ÿ���� ������ ����� ���� float ���� double�� ���� ���
		// ���� : �ֱٿ��� �⺻������ ��ǻ���� �޸� �뷮�� ������ ū ���̶�
		//		double�� ����ϴ� ���� �δ��� ����
		
		float c = 123.45f;//= (float)123.45
		System.out.println(c);
		
		double d =123.45;
		System.out.println(d);
		
		// double���� ����� Ÿ�� ��ȯ
		int testDb = 11;
		int testDb2 = 3;
		
		// ������ 3.0 : ���� java���� int�� ������ ������� ������ int������ ���
		double result2 = testDb / (double)testDb2;
		
		System.out.println(result2);
				
		

	}

}
