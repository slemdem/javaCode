package classExam;

//1.Phone Ŭ������ ��ӹ޴� SmartPhone Ŭ���� ����
//
//2. Phone Ŭ������ �⺻ �ʵ�� �𵨸�� ����
//    - �Ʒ��� ����� �޼����� ó���Ѵ�(�ʵ弱���� �ƴ�)
//    - ����� ���� Ű��, ����
//    - ���︮��
//    - ��ȭ�ϱ�
//    - ��ȭ�����ϱ�
class Phone {
	public String model;
	public String color;
	
	public Phone(String model , String color) {
		this.model = model;
		this.color = color;
	}
	
	public void turnOn() {
		System.out.println( model+" ���� ����");
	}
	public void turnOff() {
		System.out.println( model+" ���� ����");
	}
	public void bell() {
		System.out.println("��-�����-");
	}
	public void callOn() {
		System.out.println("��ȭ ��...");
	}
	public void callOff() {
		System.out.println("��ȭ ����");
	}
}

//3. SmartPhone Ŭ����(phone Ŭ������ �ʵ带 ����ؾ���)
class SmartPhone extends Phone{
	public String browser;
	public SmartPhone(String model, String color, String browser) {
		super(model, color);
		this.browser=browser;
	}//-  ������ ����(�ʵ�)
	
	public void brouseAct() {
		System.out.println(browser+" ���� ��");
	}//- ����� ���ͳ� �����ϱ�
	public void kakaoAct() {
		System.out.println("īī���� ���� ��");
	}//- īī���� �����ϱ�
	public void showStaitus() {
		System.out.println("�� : "+model+ "\t���� : "+color+ "\t������ : "+ browser);
	}
}

public class lunchquiz0118 {

	public static void main(String[] args) {
		 Phone iphone = new SmartPhone("iphoneX", "�� ��", "Safari");
		 
		 SmartPhone galaxy = new SmartPhone("gal 10e", "���� ��", "Crome");
		 
		 iphone.turnOn();
		 ((SmartPhone) iphone).brouseAct();
		 ((SmartPhone) iphone).showStaitus();
		 iphone.turnOff();
		 
		 galaxy.turnOn();
		 galaxy.bell();
		 galaxy.showStaitus();
		 galaxy.turnOff();
		 
	}

}
