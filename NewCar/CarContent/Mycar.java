package NewCar.CarContent;

public class Mycar {
	
	// �ʵ�
	// �� �̸�
	String name;
	Accel accel;
	Engine engine;
	Handle handle;
	Wheel wheel;
	
	public Mycar(String name) {
		this.name = name;
		this.accel = new Accel(name);
		this.engine = new Engine(name);
		this.handle = new Handle();
		this.wheel = new Wheel("��ȣŸ�̾�");
	}
	
	// �޼ҵ�
	// �� �޸���
	public void letsGo() {
		// accel Ŭ�������� ���� ���� ��� �޼��� ȣ��
		accel.push();
		// wheel Ŭ�������� ���� ���� �����̱� �޼��� ȣ��
		wheel.go();
	}
	// �õ��ɱ�
	public void ready() {
		// engine Ŭ�������� ���� �õ��ɱ� �޼��� ȣ��
		engine.start();
	}
	// ���߱�
	public void stop() {
		// engine Ŭ�������� ���߱� �޼��� ȣ��
		engine.off();
	}
	// ��ȸ��
	public void turnLeft() {
		// handle Ŭ�������� ��ȸ�� �޼��� ȣ��
		handle.left();
	}
	//��ȸ��
	public void turnRight() {
		// handle Ŭ�������� ��ȸ�� �޼��� ȣ��
		handle.right();
	}
	
	
	
}
