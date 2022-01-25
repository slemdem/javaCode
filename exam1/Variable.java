package exam1;

public class Variable {

	public static void main(String[] args) {
		// 변수 : 변하는 수
		// 변수의 이름은 개발자가 마음대로 정할 수 있음
		// but 규칙은 있음
		
		//변수명 선언의 규칙
		// 1. 숫자로 시작하면 안된다
		// 2. $, _ 이외의 특수문자는 사용 불가
		// 3. 키워드는 변수명으로 사용할 수 없음
		//    - new, char, case, catch, if, for, try, this
		//      throw, final, import, goto, do, while
		
		// 자바에서의 변수명 지정
		// 변수의 타입과 변수 명을 작성
		// int 정수형 변수 타입 
		// int A = n  변수 A에 정수 n을 할당한다
		
		// ""를 사용해야 문자로 인식한다
		int myvariable = 100000000;
		String test = "출력테스트";
		
		System.out.println(myvariable);
		System.out.println(test);
		
		// 정수형 연산(숫자연산)
		
		/*
		 * int a = 30; int b = 15; int c = 9;
		 * 
		 * System.out.println(a+b);
		 * System.out.println(a-b);
		 * System.out.println(a*b);
		 * System.out.println(a/b);
		 * 
		 * System.out.println(a%c); // a/c의 나머지
		 * System.out.println(b%c); // b/c의 나머지
		 */
		// 증감연산
		// 기호를 이용해서 값을 증가시키거나 감소 시킬 수 있는 연산
		// 증감연산자는 연산자의 위치에 따라 계산되는 순서가 다르다
		
		int test1 = 0;
		int test2 = 5;
		
		//test1++; // 값이 참조된 후에 증가 후위연산
		//++test1; // 값이 참조되기 전에 증가 전위연산
		//test2--;
		
		//System.out.println(test1);
		//System.out.println(test2);
		
		System.out.println(test1++);
		System.out.println(test2);
		System.out.println(test1);
		System.out.println(--test2);
		
		
		// ; = 라인의 종료를 선언 없으면 프로그램이 안 돌아감
		
		// 자바의 자료형
		// 정수형
		// int : 기본 정수형 / 4byte(32bit) / -2^31 ~ 2^31-1
		// byte : 1byte(8bit)
		// short : 2byte(16bit)
		// long : 8byte(64bit)
		
		// 실수형
		// float : 4byte
		// double : 8byte
		
		// 논리형
		// boolen : true / false
		
		// 문자열 vs 문자형(문자)
		// 여러개의 문자 한 개의 문자
		// String : 1byte
		// StringBuffer
		// 문자형
		// char : 2byte
		
	}

}
