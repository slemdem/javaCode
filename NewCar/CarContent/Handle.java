package NewCar.CarContent;

public class Handle {
	// ��ȸ��
	void left() {
		// ��ȸ���� �� �� �����̸� Ű�� ������
		// �ܼ��� �޼��� ó���� �ƴ�
		// �޼��� ȣ���� ���� ó��
		leftLightOn();
		System.out.println("��ȸ�� ����");
		leftLightOff();
	}
	
	void leftLightOn() {
		System.out.println("���� ������ on");
	}
	void leftLightOff() {
		System.out.println("���� ������ off");
	}
	
	// ��ȸ��
	void right() {
		rightLightOn();
		System.out.println("��ȸ�� ����");
		rightLightOff();
	}
	void rightLightOn() {
		System.out.println("���� ������ on");
	}
	void rightLightOff() {
		System.out.println("���� ������ off");
	}
	
	
}
