package interFaceExam;

public abstract interface Doggy2 {
	
	//�������̽��� �߻�Ŭ����ó�� abstract �޼ҵ带 �̿��ؼ�
	// �߻� �޼ҵ带 �����Ѵ� ��� Ŭ������ static final�̾�� �Ѵ�
	
	//�������̽��� Ư¡
	// 1. �����ڸ� ���� �� ������ �� ����
	//	- �������̽��� ���뵵
	//		�߻�Ŭ������ Ȯ���� ���ؼ� ���������
	// 		�������̽��� �޼ҵ��� �Ծ��� ���� ����ϴ� ��찡 ���� ����
	// 2. �������̽� ������ �����ϴ� �ʵ�� ������·� ����
	// 3. �������̽� ������ ����� �޼ҵ�� �߻� �޼ҵ�� �۾��ؾ� �Ѵ�.(��� java 1.8������)
	// 4. ��ӹ޴� Ŭ������ �ݵ�� �������̽��� �޼ҵ带 �������̵� �ؾ��Ѵ�
	// 5. �������̽��� ������ ������ �����ϴ� Ŭ������ implements�ؾ��Ѵ�
	
	// �߻�Ŭ���� vs �������̽�
	// 2. ������ ���� ���ɿ���
	// 2. ���� ����
	
	public static final String color = "����";
	
	public abstract void playing();

	public abstract void sleep();
	
	public abstract void eat();
	
	public static String getcolor() {
		return color;
	}
	
}
