package interFaceExam;

//implements�� ���߻���� ��ü �� �� ����
public class Samoade implements Doggy2 {
	
	private static String name;
	
	public Samoade(String name) {
		//�������̽��� super Ű���尡 �ʼ��� �ƴϴ�
		this.setName(name);
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("�پ��� ��");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzzZZZZZZZZ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�y�y");
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Samoade.name = name;
	}

}
