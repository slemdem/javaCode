package classExam;
//Ŭ���� ����


class Test{
	// ��ü�� �Ӽ�(�ɹ�����)
	public String stuName;
	public int stuID;
	// ��ü�� ���(�޼ҵ�)
	// 1. �л��� ������ ���� �޼ҵ�
	public void showStudentInfo() {
		//������(�Լ���) ������ ǥ���
		// 1. PascalCase(�Ľ�Į ǥ���)
		//		-�ܾ� ���̻��� ���� �빮�ڷ� ǥ�������ν� �ܾ ����
		// 2. camelCase(ī�� ǥ���)
		//		-ù���� ���� �ܾ� ���̻��� ���� �빮�ڷ� ǥ�������ν� �ܾ ����
		//			�빮�ڸ��� Ƣ����°� ��Ÿ �� ���ٰ� �ٿ���
		// 3. snake_case(������ũ ǥ���(�����/������ھ� ǥ���))
		//		-�ܾ� ���̻��� ���� _�� ǥ�������ν� �ܾ ����
		
		System.out.println(stuName+stuID);
		
	}
	
}

public class Student1 {
	
	public static void main(String[]args) {
		// ������ �����ص� test Ŭ������ ��ü�� ����
		// �ν��Ͻ� : Ŭ������ ���� ������ ��ü
		Test stuLee = new Test();
		// �ν��Ͻ� stuLee�� �ɹ����� stu�� "������"�Ӽ� �ο�
		stuLee.stuName = "������";
		stuLee.stuID = 001;
		
		//stuLee�ν��Ͻ��� showStudentInfo �޼��� ȣ��
		stuLee.showStudentInfo();
		
		//
		Test stu002 = new Test();
		stu002.stuName = "������";
		stu002.stuID = 100;
		
		stu002.showStudentInfo();
		
		System.out.println(stuLee);
		System.out.println(stu002);
		
		
	}

}
