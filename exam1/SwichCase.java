package exam1;

public class SwichCase {

	public static void main(String[] args) {
		// switch��
		// �־��� ���ǰ��� ����� ���� ���α׷��� �ٸ� ����� �����ϵ��� �ϴ� ���ǹ�
		
		// switch���� ����
		// 1. �������� if�� ���� �پ��
		// 2. �����Ϸ� ���忡�� ����ȭ�� ������ �ӵ��� ������
		
//		switch(���ǰ�) {
//			case ��1 :
//				���ǿ� �´ٸ� �����ϴ� ��ɹ�;
//				break;
//			default :
//				���ǰ��� ��𿡵� �ش����� ������ �����ϴ� ��ɹ�;
//				break;
//		}
		
		// ���ĺ��� �������� �������� üũ
		// break : �ڵ��� ������ �ߴܽ�Ű�� Ű����
		// ���� switch case���� break������ �ʴ´ٸ� ���� �����ϴ�
		// ��� case���� defalut���� �����ϰ� �ȴ�
		
//		char c;
//		
//		switch(c) {
//			case 'a' :
//				System.out.println("�ش� ���ڴ� a�Դϴ�");
//				break;
//			case 'e' :
//				System.out.println("�ش� ���ڴ� e�Դϴ�");
//				break;
//			case 'i' :
//				System.out.println("�ش� ���ڴ� i�Դϴ�");
//				break;
//			case 'o' :
//				System.out.println("�ش� ���ڴ� o�Դϴ�");
//				break;
//			case 'u' :
//				System.out.println("�ش� ���ڴ� u�Դϴ�");
//				break;
//			default :
//				System.out.println("���� Ȥ�� �빮���Դϴ�");
//				break;
//		}
		
		char c = 'e';
		
		switch(c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.printf("�ش� ���ڴ� %c�Դϴ�",c);
				break;
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
				System.out.printf("�ش� ���ڴ� %c�Դϴ�",c);
				break;
			default :
				System.out.println("�ش� ���ڴ� �����Դϴ�");
				break;
		}
		
		// switch~case ���� if���� ���� ������ �������̴�
		// ������ �������δ�
		// 1. �������� �� �� �ִ� ���� ���� ������ �������̴�
		
		

	}

}
