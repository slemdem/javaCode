package classExam;

class Person{
	final String nation;
	static final String SSN ="594315-481357";//�ֹε�Ϲ�ȣ�� ���������� ��ȯ
	String name;
	
	public Person( String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
}

public class finalExample {

	public static void main(String[] args) {
		//final�� ���� ������ ���� �ʾ����� �Է� ����
		Person p1 = new Person("���ڵ�" , "�ε�");
		Person p2 = new Person( "�����ں�ġ" , "���þ�");
		System.out.println(p1.nation);
		System.out.println(p1.SSN);
		System.out.println(p1.name);

//		p1.nation = "���þ�";//final�� �����Ұ� final�� ���� ������ ���� �ʾ����� �Է� ����
//		p1.ssn = "594315-481357";
//		p1.name ="�����ں�ġ";
		System.out.println(p2.nation);
		System.out.println(p2.SSN);
		System.out.println(p2.name);
	}

}
