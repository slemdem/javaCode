package classExam;

import interFaceExam.Doggy2;
import interFaceExam.Samoade;

public class InterFaceExam {

	public static void main(String[] args) {
		// interface : �߻�ȭ�� �� �� ��ü������ ������ �ִ� ����
		//				�ǹ����� ������ ���� ����ϴ� ���
		Doggy2 dog4 = new Samoade("�ж�����");
		dog4.eat();
		
		System.out.println(Doggy2.getcolor());
		System.out.println(Samoade.getName());
	}

}
