package NewCar.CarContent;

public class Wheel {
	// �ʵ念��
	String name;
	// ������
	Wheel(String wheelName) {
		this.name = wheelName;
	}
	
	// �޼���
	void go() {
		System.out.println(String.format("%s�� ������ �������ϴ�", name));
	}
	
	

}
