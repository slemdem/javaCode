package java0120;

public class Test34  extends Salary{
	
	//���ʵ� : String department (�μ�)
	String department;
	
	//������� : name, salary,department�� �Ѱܹ޾� ���� �ʵ忡 ����
	//  		�ʿ��ϸ� �θ� ������ ȣ���Ҽ��� �ִ�
	Test34(String name, int salary, String department) {
		super(name, salary);
		this.department=department;
	}
	
	//��޼��� : getInfomation2()�޼��忡�� �μ����
	public void getInformation2() {
		System.out.println("�̸� : " + name + "\n���� : " + salary + "\n�μ� : "+department);
	}
}
