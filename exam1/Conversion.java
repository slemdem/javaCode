package exam1;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨버젼(형변환)
		// 서로다른 자료형간 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
		
		// 묵시적 형 변환(자동 형 변환)
		String test1 = "result :";
		
		int a = 10;
		int b = 20;
//		
		// 자동으로 문자열로 전환되어 출력 됨
//		System.out.println(test1+a+b);
		
		
		// 명시적 형 변환(강제 형 변환)
		System.out.println(test1+(int)(a+b));
		
		String num = "1234";
		//int test = num; //묵시적 형변환을 기대하고 바로 변수의 값을 넣어봤지만 에러
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		
		//정수형 데이터를 문자형으로 바꾸기
		
		//1. 자동으로 변환 
//		int n = 123;
//		String a = ""+n;
		 		
		// 2. 메소드로 변환
//		int n = 123;
//		String a = String.valueOf(n);
//		String b = Integer.toString(n);
		
		// 실수형 추가설명 & 타입변환
		// 최근 실수타입의 변수를 사용할 때는 float 보다 double을 많이 사용
		// 이유 : 최근에는 기본적으로 컴퓨터의 메모리 용량이 굉장히 큰 편이라
		//		double을 사용하는 것이 부담이 적음
		
		float c = 123.45f;//= (float)123.45
		System.out.println(c);
		
		double d =123.45;
		System.out.println(d);
		
		// double로의 명시적 타입 변환
		int testDb = 11;
		int testDb2 = 3;
		
		// 실행결과 3.0 : 이유 java에서 int형 끼리의 결과값은 언제나 int형으로 출력
		double result2 = testDb / (double)testDb2;
		
		System.out.println(result2);
				
		

	}

}
