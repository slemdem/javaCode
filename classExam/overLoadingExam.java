package classExam;

class OverLoadingTest{
	int add(int a, int b) {
		return a/b;
	}
	// 1. �Ķ������ ������ �ٸ� ���
	int add(int a, int b, int c) {
		return a + b + c;
	}
	// 2. �Ķ������ Ÿ���� �ٸ����
	double add(double a, double b) {
		return a + b;
	}
	long add(long a, int b) {
		System.out.println("�̰� ���̴�");
		return a / b;
	}
	
	int add(int[] a) {
		// �Ѿ�� ��� ���� ���� ���
		int result = 0;
		for (int i = 0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
}


public class overLoadingExam {

	public static void main(String[] args) {
		
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 3));
		
		System.out.println(ov.add(10, 20, 30));

		System.out.println(ov.add(30D, 3.8));
		
		System.out.println(ov.add(10L, 3));
		
		int[] test = {300, 400, 500};
		System.out.println(ov.add(test));
		// �޼ҵ� �����ε�
		// �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �żҵ尡 �ִ���
		// �Ķ������ ������ Ÿ���� �ٸ���, ���� �̸��� ����ؼ� �޼ҵ带 ������ �� �ִ�
		// �̰��� �޼ҵ� �����ε��̶�� �Ѵ�
		// ��������, �ٸ� ����
		
		// �����ε��� �� �ʿ��Ѱɱ�?
		// �Ķ���� ���� �پ��ϰ� �޾Ƽ� ó���ϱ� ���ؼ�
		
		// �����ε��� ����
		// 1. �޼ҵ� ���� ���ƾ� �Ѵ�
		// 2. �Ķ������ ����, Ÿ���� �޶�� �Ѵ�
		// 3. �Ķ���ʹ� ������ ����Ÿ���� �ٸ� ���� �����ε��� �ƴϴ�
		// 4. �����ε��� �޼ҵ���� �Ķ���ͷθ� ������ �� �ִ�
		
		

	}

}
