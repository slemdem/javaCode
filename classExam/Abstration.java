package classExam;

//public class People{
//	
//	private final Table table;
//	private final Spoon spoon;
//	private final Rice rice;
//	
//	public People(Table table, Spoon spoon, Rice rice) {
//		this.table = table;
//		this.spoon = spoon;
//		this.rice = rice;
//	}
//	
//	public void eat() {
//		table.seat();
//		spoon.taken();
//		spoon.up();
//		rice.eaten();
//	}
//}


// abstract Ŭ���� : �߻�Ŭ����
// �߻�ȭ�� �� �� ��ü������ �����ִ� Ű����
abstract class Doggy {
	public String color;
	
	public Doggy(String color) {
		this.color = color;
	}
	
	//�߻� �޼ҵ�
	// �߻� �޼ҵ�� �޼ҵ� ��, ���� Ÿ��, �Ķ���͸� �����ϰ� ������ �������� ����
	// ���� ���Ǵ� ���� Ŭ�������� �� �����Ͽ� ���
	public abstract void bite();
	public abstract void eat();
	
	public void bark() {
		System.out.println("�п�");
	}
}

// �߻�Ŭ������ ��ӹ޴´ٸ�
// �߻�Ŭ������ �߻�ް�带 �ݵ�� �������̵� �ؾ��Ѵ�
class Husky extends Doggy{
	
	public Husky(String color) {
		super(color);
		
	}
	
	@Override
	public void bite() {
		System.out.println("����");
	}
	@Override
	public void eat() {
		
	}
	
}
class Shiva extends Doggy{

	public Shiva(String color) {
		super(color);
		
	}
	
	@Override
	public void bite() {
		
	}
	@Override
	public void eat() {

		System.out.println("�r�r");
	}
	public void swim() {
		System.out.println("�����ϱ�");
	}
}


public class Abstration {

	public static void main(String[] args) {
		// �߻�ȭ : ���뺸�� �ٽ����� ������ �߷����� ��
		// 1. �ٽ����� ���� �߷�����
		// 2. �߷��� �͵��� �����Ų��.
		// 3. How���� What�� ��Ŀ���� �д�
		
		//ex ) ���� �Դ´�
		// ���� �Դ´��� �ൿ
		// - ��Ź�� �ɱ�
		//		�ö�ƽ ��Ź? ö ��Ź? ���� ��Ź?
		//	- ������ ���
		//		�ݼ���? ������? �ö�ƽ?
		//	- �� Ǫ��
		//		�ҹ�? ��̹�?
		//	- ���� ������ ��������
		
		Husky dog1 = new Husky("����");
		
		dog1.bite();
		
		Shiva dog2 = new Shiva("����");
		dog2.eat();
		
		Doggy dog3 = new Husky("���");
		
		dog3.bite();
	}

}
