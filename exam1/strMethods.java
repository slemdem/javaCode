package exam1;

public class strMethods {

	public static void main(String[] args) {
		// strMethods
		// indexOf : ���ڿ�����Ư�����ڰ� ���۵Ǵ� ��ġ�� �����ϴ� �޼���
		//            0123456789X12345  X=10
		String idx = "happy lunch time";
		//System.out.println(idx.indexOf("time"));
		// ���� ã�� ���ڰ� ���ٸ� -1�� ���
		//System.out.println(idx.indexOf("hungry"));
		
		// contains : ���ڿ����� Ư�����ڿ��� ���ԵǾ� �ִ°��� ���θ� ��/�������� �����ϴ� �޼���
		//System.out.println(idx.contains("time"));
		//System.out.println(idx.contains("hungry"));
		

		// charAt, substring
		// substring : ���ڹ迭�� Ư���� ��ġ�� ���ڸ� �̾Ƴ� ��� ���
		//System.out.println(idx.charAt(4));
		// substring : ���ڹ迭�� Ư�� �κ��� �̾Ƴ� ��� ��� a~b�� ���� �� a,b+1
		//System.out.println(idx.substring(0,4));
		
		
		// equals : �ΰ��� ���ڿ��� ���������� ���� ������� ����
		String equ1 = "hello";
		String equ2 = "lunch";
		String equ3 = "hello";
		String equ4 = new String("hello");
		
		//System.out.println(equ1.equals(equ3));
		//System.out.println(equ1.equals(equ2));
		//System.out.println(equ1.equals(equ4));
		
		//System.out.println(equ1==equ3);
		//System.out.println(equ1==equ4);

		// replace, replaceAll
		// replaceAll�� ����ǥ������ ��� �����ϴ�
		// replace�� char, replaceAll�� String
		String repl1 = "test";
		System.out.println(repl1.replace("st", "ji"));
		System.out.println(repl1.replaceAll("st", "ji"));
		
		// toUpperCase(��� �빮�ڷ�), toLowerCase(��� �ҹ��ڷ�)
		String Case1 = "Funny Java";
		
		System.out.println(Case1.toUpperCase());
		System.out.println(Case1.toLowerCase());
		
		//split
		// ���ڿ��� Ư�� �����ڷ� �и�
		String case2 = "q:w:e:r";
		String[] result = case2.split(":");
		System.out.println(result[0]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
