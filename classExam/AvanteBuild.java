package classExam;

class NewAvante {
	public float battery;//���͸�
	public float speed; //�ӵ�
	public float fuel; //�⸧(�ִ� 50L)
	
	public void speedUp() {
		speed+=10;
	}
	
	public void showCar() {
		float realFuel = ((float)(fuel)<=50) ? (realFuel=fuel) : 50;
		System.out.println("���͸� : " +battery+ "\t �ӵ� : " +
				speed + "km \t�⸧ : " + realFuel +"L");
	}
}

public class AvanteBuild {

	public static void main(String[] args) {
		//AvanteBuild��� ���ϻ���
		// NewAvante��� Ŭ����
		// Ŭ������ ���� �ɹ� ����
		//���͸�
		//�ӵ�
		//�⸧(�ִ� 50L)
		
		//Ŭ���� �޼�Ʈ
		// speedUp
		// �ż��带 ȣ�� �� ������ �ش� �ν��Ͻ��� �ӵ� ������ �� ����
		// showCar
		// �ż��带 ȣ�� �� �� �ش� �ν��Ͻ� �ɹ������� ���� Ȯ��
		
		NewAvante a = new NewAvante();
		a.battery = 30;
		a.speed = 130;
		a.fuel =60;
		
		a.speedUp();
		a.showCar();
	}

}
