package java0119;

public class EnumAndSingleTon extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enum �ǹ��ִ� ����� �����ϰ� ���α׷��Ǿ������� ���� ���Ǵ� singleton�� ����
		// singleton : �ν��Ͻ� ���� ���� �� �ϳ�
		//				�ν��Ͻ��� �� �� �����ϰ� �ν��Ͻ� ������
		//				���� �޼��忡�� �����Ͽ� ����ϴ� ����
		// �̱��� ������ new Ű����� �ν��Ͻ��� �������� ���ϰ� �Ѵ�
		// �׿� ���ÿ� �ν��Ͻ��� ������ �� �ִ� Ư���� ���� �޼ҵ带 ���ؼ���
		// �ν��Ͻ��� �����ϵ��� ó���ϰ� �ν��Ͻ��� 
		// ���� ������ �����Ͽ� �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�
		
//		//���信 �缭 ���ϴ� ������ �����ϴ� ���α׷�
//		//���ĺ����ڵ带 �ο��ϰ�
//		//�ش� �ڵ� ���ý� ������ ���������� ��
//		int choice = 0;
//		
		// �޼��带 ȣ���ؼ� ����� ����ϴ� �κ��� ������ x
		//but �����ε� ��� �μ��� ���޹��� �� �־ ������ ��������� ������ �߻��� �� �ִ�
		Person person = new Person();
		Person.choice(FoodCategory.PIZZA);
		
		//������� �޼���
		//name : enum ����� ���ǵ� �̸��� ����
		//System.out.println(FoodCategory.KAL.name());
		//ordinal :enum ����� ���ǵ� �������� ����
		//System.out.println(FoodCategory.PIZZA.ordinal());
		
		System.out.println(FoodCategory.CHICKEN.name);
		System.out.println(FoodCategory.KAL.price);
		
		// enum�� �����ڴ� �⺻������ private
		
		// �̱��� �������� �ۼ��� Ŭ�������� �ν��Ͻ� �����ϱ�
		
		// �̱��� ����� ���� : �����Ǵ� �ν��Ͻ����� ������ �������� �����ϱ� ������
		//					�޸� ������ ������ �� �ִ�
		
		// �ν��Ͻ� ������ �����Ͽ� ����ϰų� �޼ҵ�
		Configuration con1 = Configuration.getInstance();
		Configuration con2 = Configuration.getInstance();
		
		System.out.println(con1.getTest1Name());
		System.out.println(con2.getTest2Name());

	}

}
