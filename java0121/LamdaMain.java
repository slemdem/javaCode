package java0121;

class Test0121{
	public void testMethod() {
		System.out.println("test");
	}
	
}

public class LamdaMain {

	public static void main(String[] args) {
		// �͸� Ŭ���� : ��ӹ޴� Ŭ������ ��������� ������ Java������ ����
		// 		Ŭ������ ����°� �ƴ϶� �ڵ� ���ο� �̸��� �������� �ʴ� Ŭ������ ����°�
		
		// Test 0121 Ŭ������ ��ӹ޴� �͸��� Ŭ���� ����
//		Test0121 test = new Test0121() {
//			//Test0121Ŭ�������� �͸��� Ŭ������ �������̵�
//			public void testMethod() {
//				System.out.println("�������̵�");
//			}
//			//���ο� �޼ҵ� ����
//			// �ܺο��� ȣ���� �Ұ���
//			// ������ �ν��Ͻ� test�� Test0121Ŭ������ �ƴ϶�
//			// Test0121Ŭ������ ��ӹ޴� �͸�Ŭ�����̱� ����
//			public void serve() {
//				System.out.println("lol");
//			}
//		};
//		
//		test.testMethod();
		// �͸�Ŭ������ ���� ����?
		// �߻�Ŭ������ �������̽� ����
		//	 -> ������ ������ ��� �͸�Ŭ������ �̿��ؼ� ó���ϱ⵵ �Ѵ�
		
		// �߻�Ŭ������ �͸� Ŭ������ �����ص� �޼���� �ݵ�� ������ �Ǿ�� �Ѵ�
//		// �߻�Ŭ������ �͸�Ŭ������ �����ص� �޼���� �ݵ�� ������ �Ǿ���Ѵ�.
		People p1 = new People() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("���� ����");
				walk();
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		p1.sleep();
		
		//Operate �������̽��� �̿��ؼ� ���ٽ� ����
		
		// ���� ǥ������ ��� ����
		// 1. �������̽�
		// 2. �������̽��� �ϳ��� �߻� �޼��常 ����
		
		
//		Operate operate =(a,b) -> {
//			return a+b;
//		};
		
//		Cal c1 = new Cal(100,200);
//		
//		int result = c1.result((a,b) -> {
//			return a+b;
//		});
//		
//		System.out.println(result);
//		
	}

}
