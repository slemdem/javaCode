package exam1;

public class SrtFormatting {

	public static void main(String[] args) {
		// StrFormatting
		// ���ڿ� ������ : ���ڿ� �ȿ� ��� ���� �����ϴ� ���
		//
		
		//int money = 15000 ;
		//String day = "tomorrow";
		//System.out.println(String.format("I need %d money %s", money, day));
		// ���ڿ� ���� �ڵ�
		// %s : ���ڿ�
		// %c : char
		// %d : ����
		// %f : �ε��Ҽ���
		// %o : 8����
		// %x : 16����
		// %% : ���� % �� ��ü
		
		// ���� 
		// ������ ������ ����� ������
		// ����� ���� : error clean 95%
		// ���� ���ڴ� ���ڴ�� ���ڴ� ���ڴ�� Ÿ���� �������
		//String errorClean = "error clean";
		//int persent = 95 ;
		//System.out.println(String.format("%s %d%%", errorClean, persent));
		
		//������ �ڵ�� ���� ���
		//�����ڵ� + ������ ������� ������ ��� ����
		
		System.out.println(String.format("%10s", "test"));
		
		// �����ڵ忡�� ���� �ڵ� ���� ������ �ǹ̴� ���̰� 10���� ���ڿ� �������� 
		// ���Ե� ���� �������� �����ϰ� �������� �������� ���ܵζ�� �ǹ�
		
		// ���� ���ڰ� ������� ���Ե� ���� �������� ���� �� �������� �������� ó���Ѵ�
		System.out.println(String.format("%-10sjm","hi"));;
		
		// format �޼��� ��� �Ʒ��� ���� ���·ε� ��� ����
		// �������� printf�� ����� ��¸� ����, format �޼���� ����� ��ȯ(����)
		System.out.printf("%-10sjm","hi");
	}

}
