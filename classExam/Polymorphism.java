package classExam;

class Dog {
	public String color;
	
	public void bite() {
		System.out.println("������");
	}
	public void bark() {
		System.out.println("¢��");
	}
	public void eat() {
		System.out.println("��Ա�");
	}
	
	public void showColor() {
		System.out.println("���� ���� " + color +"�̴�");
	}
	
}

class Viggle extends Dog{
	
}
class GoldenRetriver extends Dog{
	public void swim() {
		System.out.println("�����ϱ�");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
//		// ��ü�� ����ȯ-> �ٲ� �ڷ������� ����ϰڴ�.
//		// 	 - �ν��Ͻ��� ���� ���� �ƴϴ�
//		
//		Dog d1 = new Dog();
////		GoldenRetriver d2 = new GoldenRetriver();
//		//�Ʒ��� �ڵ�� ���� ��帮Ʈ������ ��� �ϴ� �Ͱ� ����
//		GoldenRetriver d2 =(GoldenRetriver)d1;
//		
//		// ����� ���� ��� �̾߱� �ϴ� �Ͱ� ����
//		// ��ü�� ����ȯ
//		Dog dd = new Viggle();
//		Viggle v1 = (Viggle)dd;
//		
//		// ��Ʈ������ ����
//		// ���� ��Ʈ������
//		
//		// ������
//		// ��ü���� ����� Ư���� �ϳ�
//		// �������� ���¿� ���� �� �ִ� �����̶� ������
//		// �ϳ��� ��ü �ν��Ͻ��� �������� �ڷ����� ���� �� �ִ� ��
//		
//		// is-a
//		// 1. ��Ҵ� ��ü�̴�
//		// 2. ��𿹵�� ����
//		// 3. �ڸ��� �����°���̴�
//		// 4. ���α׷��� ���� JAVA��
//		
//		// ���� 
//		// �θ� Ŭ���� Dog�� ��ӹ޴� 
//		// Viggle Ŭ������ GoldenRetriver Ŭ������ �����Ͻð�
//		// ����  GoldenRetriver Ŭ������ ������ �� �ִ� �����ϰ� swim �żҵ带 �߰��ϼ���
//		
//		// Dogũ������ �⺻ ���
//		// �ʵ� ����
//		// �⺻�ൿ : ������ ��Ա� ¢��
		
		// instanceof
		// �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ����� Ȯ���ϴ� ������
		// ������ or �ν��Ͻ��� + instanceof + Ŭ���� ��
		
		Dog dog = new GoldenRetriver();
		System.out.println(dog instanceof GoldenRetriver); //true
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Viggle);
		
	}

}
