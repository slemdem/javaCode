package classExam;
	//����
	// �ؾ�� ����� Fish bread Up Ŭ���� ����
	// ���� Ŭ���� �̸��� FishMain
	
	// Fish Bread Up Ŭ�������� Ŭ�������� ������ �Լ� cream�� ����
	
	// Fish Bread Up Ŭ������ ���� �ν��Ͻ��� ������ ������ ������
	// ������ �ν��Ͻ��� ���� cream �ʵ带 �¿��ְ�
	// ����� ���� �ؾ�� ���弼��

class FishBreadUp {
	
	static String bread = "�ؾ";
	public String cream;
	
	//�Ķ���ʹ� ��ġ�ϰų� �����ִ� �ܾ�� �����ϴ� �� ����
	FishBreadUp(String cream) {
		this.cream = cream;
	}
	
	public void eatFishBread() {
		System.out.println(bread + "�ȿ��� "+cream +"��(��) ����־���!");
	}
	
}

public class FishMain {

	public static void main(String[] args) {
		FishBreadUp redbean = new FishBreadUp("��");
		FishBreadUp custard = new FishBreadUp("��ũ��");
		FishBreadUp mint = new FishBreadUp("��Ʈ");
		redbean.eatFishBread();
		custard.eatFishBread();
		mint.eatFishBread();
		

	}

}
