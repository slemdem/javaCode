package exam1;

public class Variable {

	public static void main(String[] args) {
		// ���� : ���ϴ� ��
		// ������ �̸��� �����ڰ� ������� ���� �� ����
		// but ��Ģ�� ����
		
		//������ ������ ��Ģ
		// 1. ���ڷ� �����ϸ� �ȵȴ�
		// 2. $, _ �̿��� Ư�����ڴ� ��� �Ұ�
		// 3. Ű����� ���������� ����� �� ����
		//    - new, char, case, catch, if, for, try, this
		//      throw, final, import, goto, do, while
		
		// �ڹٿ����� ������ ����
		// ������ Ÿ�԰� ���� ���� �ۼ�
		// int ������ ���� Ÿ�� 
		// int A = n  ���� A�� ���� n�� �Ҵ��Ѵ�
		
		// ""�� ����ؾ� ���ڷ� �ν��Ѵ�
		int myvariable = 100000000;
		String test = "����׽�Ʈ";
		
		System.out.println(myvariable);
		System.out.println(test);
		
		// ������ ����(���ڿ���)
		
		/*
		 * int a = 30; int b = 15; int c = 9;
		 * 
		 * System.out.println(a+b);
		 * System.out.println(a-b);
		 * System.out.println(a*b);
		 * System.out.println(a/b);
		 * 
		 * System.out.println(a%c); // a/c�� ������
		 * System.out.println(b%c); // b/c�� ������
		 */
		// ��������
		// ��ȣ�� �̿��ؼ� ���� ������Ű�ų� ���� ��ų �� �ִ� ����
		// ���������ڴ� �������� ��ġ�� ���� ���Ǵ� ������ �ٸ���
		
		int test1 = 0;
		int test2 = 5;
		
		//test1++; // ���� ������ �Ŀ� ���� ��������
		//++test1; // ���� �����Ǳ� ���� ���� ��������
		//test2--;
		
		//System.out.println(test1);
		//System.out.println(test2);
		
		System.out.println(test1++);
		System.out.println(test2);
		System.out.println(test1);
		System.out.println(--test2);
		
		
		// ; = ������ ���Ḧ ���� ������ ���α׷��� �� ���ư�
		
		// �ڹ��� �ڷ���
		// ������
		// int : �⺻ ������ / 4byte(32bit) / -2^31 ~ 2^31-1
		// byte : 1byte(8bit)
		// short : 2byte(16bit)
		// long : 8byte(64bit)
		
		// �Ǽ���
		// float : 4byte
		// double : 8byte
		
		// ����
		// boolen : true / false
		
		// ���ڿ� vs ������(����)
		// �������� ���� �� ���� ����
		// String : 1byte
		// StringBuffer
		// ������
		// char : 2byte
		
	}

}
