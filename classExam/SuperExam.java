package classExam;

class People{
	public String name;
	public String phone;
	
	public People(String name , String phone) {
		this.name = name;
		this.phone = phone;
	}
}

class Student extends People{
	public int stuNo;
	
	public Student(String name , String phone, int stuNo) {
		super(name,phone);
		this.stuNo = stuNo;
	}
}

public class SuperExam {

	public static void main(String[] args) {
		// super (�θ������ ȣ��)
		// ��ü ������ ����
		// �ڽ� ��ü ������ �θ�ü�� ���� ���� �� �ڽİ�ü ����
		// ��� ��ü�� Ŭ������ ������ ȣ���� ��Ģ���� �Ѵ�
		// ���� ��������� �������� �ʴ´ٸ� �ڽ�Ŭ�������� super()�� ����
		
		// super() Ű����� '������' ù�ٿ� ����

	}

}
