package classExam;

class OverLoadingTest{
	int add(int a, int b) {
		return a/b;
	}
	// 1. 파라미터의 개수가 다른 경우
	int add(int a, int b, int c) {
		return a + b + c;
	}
	// 2. 파라미터의 타입이 다른경우
	double add(double a, double b) {
		return a + b;
	}
	long add(long a, int b) {
		System.out.println("이건 롱이다");
		return a / b;
	}
	
	int add(int[] a) {
		// 넘어온 모든 수의 합을 계산
		int result = 0;
		for (int i = 0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
}


public class overLoadingExam {

	public static void main(String[] args) {
		
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 3));
		
		System.out.println(ov.add(10, 20, 30));

		System.out.println(ov.add(30D, 3.8));
		
		System.out.println(ov.add(10L, 3));
		
		int[] test = {300, 400, 500};
		System.out.println(ov.add(test));
		// 메소드 오버로딩
		// 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 매소드가 있더라도
		// 파라미터의 개수나 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다
		// 이것을 메소드 오버로딩이라고 한다
		// 동명이인, 다른 성격
		
		// 오버로딩은 왜 필요한걸까?
		// 파라미터 값을 다양하게 받아서 처리하기 위해서
		
		// 오버로딩의 조건
		// 1. 메소드 명이 같아야 한다
		// 2. 파라미터의 개수, 타입이 달라야 한다
		// 3. 파라미터는 같지만 리턴타입이 다른 경우는 오버로딩이 아니다
		// 4. 오버로딩된 메소드들은 파라미터로만 구별될 수 있다
		
		

	}

}
