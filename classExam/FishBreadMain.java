package classExam;

class FishBread {
	public String fishCode;//�ؾ��ȣ
	public String inside; //�ؾ ��
	public String flourCode;//�а��� ������ 
	
	public void showFish() {
		System.out.println("��ȣ : " +fishCode+ "��� : " +
							inside + "������ : " + flourCode );
	}
}

public class FishBreadMain {
	public static void main(String[] args) {
		
		FishBread fi = new FishBread();
		
		fi.fishCode = "001";
		fi.inside = "��";
		fi.flourCode ="�̱���";
		
		fi.showFish();
		
		FishBread fi2 = new FishBread();
		
		fi2.fishCode = "002";
		fi2.inside = "��ũ��";
		fi2.flourCode ="�߱���";
		
		fi2.showFish();
		
		//AvanteBuild��� ���ϻ���
		// NewAvante��� Ŭ����
		// Ŭ������ ���� �ɹ� ����
		//���͸�
		//�ӵ�
		//�⸧(�ִ� 50L)
		
		//Ŭ���� �޼�Ʈ
		// speedUp
		// �ż��带 ȣ�� �� ������ �ش� �ν��Ͻ��� �ӵ� ������ �� ����
		// speedUp
		// �ż��带 ȣ�� �� �� �ش� �ν��Ͻ� �ɹ������� ���� Ȯ��

	}

}
