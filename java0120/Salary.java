package java0120;

public class Salary {
	//	���ʵ�: String name(�̸�)
	//		  int salary (����)
	String name;
	int salary;
	
	//	������� : Salary(String n, int s) �� �Ѱܹ޾� name, salary�� ����	
	Salary(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	
	//��޼��� : getInfomation1()�޼��忡�� �̸��� ������ ���
	public void getInformation1() {
		System.out.println("�̸� : " + name + "\n���� : " + salary +"��");
	}

}
