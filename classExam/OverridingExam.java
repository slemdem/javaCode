package classExam;

class Cat{
	String color = "����";
	
	public void sleep() {
		System.out.println("zzzzzzzzzzzZZZZZZZZZZ");
	}
	public void bite() {
		System.out.println("�V");
	}
	public void eat() {
		System.out.println("����� ��� �Դ� ��");
	}
}

class Lion extends Cat{
	String color = "�����";
	// cat�� bite �޼ҵ� �������̵�
	public void bite() {
		super.bite();
		System.out.println("����� ����Ͽ����ϴ�.");
	}
	public void eat() {
		System.out.println("��� �Դ� ��");
	}
}


public class OverridingExam {

	public static void main(String[] args) {
		// �������̵� -> �켱���ϴ�
		// �θ�Ŭ������ ���ǵ� ���뺸�� �ڽ�Ŭ�������� ���ǵ� ������ �� �켱��
		// ������ ������ �� ����
		
		Lion chunsik = new Lion();
		Cat streetcat = new Lion();
		Cat strcat2 = new Cat();
		// �������� �������̵� 
		// �������ε尡 �� �޼��尡 �����Ѵٸ� 
		// ������ �޶�����
		
		// Lion Ŭ������ ���ǵ� �޼ҵ� eat ȣ��
		chunsik.eat();
		chunsik.bite();
		// Cat Ŭ������ eat ȣ��
		streetcat.eat();
		streetcat.bite();
		
		// �׷��ٸ� �θ�Ŭ������ �޼��带 ȣ���ϴ¹���� ���°�?
		// super.�޼ҵ� ��()
		
		// �޼ҵ��� �������̵� ->�ʵ嵵 �������̵� ����? X �Ұ���
		System.out.println(chunsik.color);
		System.out.println(streetcat.color);
		System.out.println(strcat2.color);
		
	}

}
