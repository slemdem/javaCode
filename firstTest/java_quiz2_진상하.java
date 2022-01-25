package firstTest;

public class java_quiz2_Áø»óÇÏ {
	
	public static int return_add(int a, int b) {
		int sNo = (a>b) ? b : a ;
		int bNo = (a<=b) ? b : a ;
		int result=0;
		
		for (int i=sNo; i <= bNo ; i++) {
			result+=i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(return_add(2,5));

	}

}
