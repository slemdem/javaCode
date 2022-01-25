package java0119;

public class Configuration {
	// �̱��� ���� ���� Ŭ����
	// �ν��Ͻ��� ���� ������ �����Ͽ� �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�
	private static Configuration config;
	

	private String test1 = "�׽�Ʈ 1";
	private String test2 = "�׽�Ʈ 2";
	
	
	// �׿� ���ÿ� �ν��Ͻ��� ������ �� �ִ� Ư���� ���� �޼ҵ带 ���ؼ���
	// �ν��Ͻ��� �����ϵ��� ó���ϰ� 
	public static Configuration getInstance() {
		if (config == null) {
			config = new Configuration();
		}
		return config;
	}
	
	public String getTest1Name() {
		return test1;
	}
	public String getTest2Name() {
		return test2;
	}
	
	
}
