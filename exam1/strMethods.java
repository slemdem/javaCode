package exam1;

public class strMethods {

	public static void main(String[] args) {
		// strMethods
		// indexOf : 문자열에서특정문자가 시작되는 위치를 리턴하는 메서드
		//            0123456789X12345  X=10
		String idx = "happy lunch time";
		//System.out.println(idx.indexOf("time"));
		// 만약 찾는 문자가 없다면 -1을 출력
		//System.out.println(idx.indexOf("hungry"));
		
		// contains : 문자열에서 특정문자열이 포함되어 있는가의 여부를 참/거짓으로 리턴하는 메서드
		//System.out.println(idx.contains("time"));
		//System.out.println(idx.contains("hungry"));
		

		// charAt, substring
		// substring : 문자배열중 특정한 위치의 문자를 뽑아낼 경우 사용
		//System.out.println(idx.charAt(4));
		// substring : 문자배열중 특정 부분을 뽑아낼 경우 사용 a~b를 뽑을 때 a,b+1
		//System.out.println(idx.substring(0,4));
		
		
		// equals : 두개의 문자열이 동일한지를 비교해 결과값을 리턴
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
		// replaceAll은 정규표현식이 사용 가능하다
		// replace는 char, replaceAll은 String
		String repl1 = "test";
		System.out.println(repl1.replace("st", "ji"));
		System.out.println(repl1.replaceAll("st", "ji"));
		
		// toUpperCase(모두 대문자로), toLowerCase(모두 소문자로)
		String Case1 = "Funny Java";
		
		System.out.println(Case1.toUpperCase());
		System.out.println(Case1.toLowerCase());
		
		//split
		// 문자열을 특정 구분자로 분리
		String case2 = "q:w:e:r";
		String[] result = case2.split(":");
		System.out.println(result[0]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
