package exam1;

public class strBuffeer {

	public static void main(String[] args) {
		// stringbuffer : ���ڿ��� �߰��ϰų� ������ �� ����ϴ� �ڷ���
		// ���� �߰��� ��ü�� ���� ������ �ʿ䰡 ���� ������ �޷θ� ��뿡�� �̵��� ���� ������ �� ����
		
		// stringBuffer�� �����
		// �ڷ��� ũ�� ��ü�� ���ſ� �� (string�� 2��)
		// string�� strinBuffer�� ���������� ������ �ʿ�
		// stringBuffer : �����۾��� ���� �� 
		// string : �����۾��� ���� ���� �� 
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("2022");
		sb.append(" ");
		sb.append("java");
		sb.insert(5, "everybody");
		String result = sb.toString();
		System.out.println(result);
		
		String greeting = "hello";
		String teamName = "java web devTeam";
		int year = 2022 ;
		System.out.println(String.format("%s %d %s",greeting, year, teamName));

	}

}
