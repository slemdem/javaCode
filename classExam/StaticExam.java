package classExam;

class MemberCall {
	int iv = 100; // �ν��Ͻ� ���� ����
	static int cv = 250; // Ŭ���� ���� ����
	
	// �ν��Ͻ� ����� �����ϴ� �������� Ŭ���� ����� �׻� �����Ѵ�
	// Ŭ���� �ɹ��� �����ϴ� ������ �ν��Ͻ� �ɹ��� �����Ѵٴ� ������ ����
	int iv2 = cv;// Ŭ���� �ʵ��� ���� �ν��Ͻ� �ʵ忡 ����
	//static int cv2 = iv;// ������ ������� �ν��Ͻ� �ʵ��� ���� Ŭ���� �ʵ忡 ���� �Ұ���
	static int cv2 = new MemberCall().iv;//�̷��� �ϸ� ����(����� ������)
	
	// �ν��Ͻ� �޼ҵ忡�� Ŭ���� ���� ��� ����
	void instancMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	// Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ��� �Ұ���
	static void staticMethod1() {
//		System.out.println(iv);
		System.out.println(cv);
	}
	
}

public class StaticExam {

	public static void main(String[] args) {
		MemberCall me = new MemberCall();
		System.out.println(me.cv);
		System.out.println(me.iv);
		System.out.println(me.iv2);
		
	}

}
