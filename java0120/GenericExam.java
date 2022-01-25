	package java0120;

import java.util.ArrayList;
import java.util.List;

class GenericTest<T> {
	// 일반적으로 <T>를 사용
	// T는 객체타입만 가능해서 Integer 클래스를 사용해야 정수형을 읽을 수 있음
	// T는 인스턴스 변수로 간주된다
	//	 -> static에는 사용 불가
	// 제네릭 배열 생성은 불가능
	// new, instanceOf 연산자는 T를 피연산자로 사용 불가
	T item;
	
	// 제네릭 메서드
	// 메소드의 파라미터, 혹은 리턴에 제네릭이 사용될 수 있음
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	// 와일드 카드
	// ?를 이용해서 타입을 조금 자유롭게 사용할 수 있지만
	// 오버로딩이 적용되지 않는다.
	// ? : object
	
	@SuppressWarnings("hiding")// 필요없는거 있다
	public <T> List<Character> convert(GenericTest<T> gen) {
		ArrayList<Character> list = new ArrayList<>();
		
		String ch = String.valueOf(gen.getItem());
		for (int i = 0; i<ch.length();i++) {
			list.add(ch.charAt(i));
		}
		return list;
		
	}
	
}


public class GenericExam {

	public static void main(String[] args) {
		GenericTest<String> gen2 = new GenericTest<>();
		gen2.setItem("test");
		System.out.println(gen2.getItem());
		
		GenericTest<Integer> gen1 = new GenericTest<>();
		gen1.setItem(123456);
		
		System.out.println(gen2.convert(gen2));
		System.out.println(gen1.convert(gen1));
		// Generic : 파라미터를 받아올 때 정상적인 타입인지 체크해 주는도구
		// <   >   <-----이렇게 생김
		// 타입의 안정성을 위해 제네릭이 필요
		// 고정된 코드에서는 크게 문제되지 않음
		// 하지만 실행과정에서 동적으로 전달되는 객체를 참조해야 할 때 
		// 잘못된 타입이 전달되면 문제가 '심각'해진다
		
		// col이라는 객체를 생성하는데 red라는 문자열 데이터가 사용된 사례
		// 만약 문자열값이 잘못됐다면 실행중에 에러가 발생
		// Color color = new Color("red");
		// 데이터가 구성될 수 있는 클래스를 설계시 제네릭을 사용해서 타입문제를 차단할 수 있다
//		Color col = new Color<Color.red>;
		
		// ArrayList의 경우 클래스로 Object 타입의 데이터를 저장할 수 있다
		// Object 클래스는 최상위 클래스(모든 자바 클래스의 슈퍼클래스)
		//	 -> 실제로 모든 자바 클래스가 요소로 들어갈 수 있다
		// ArrayList가 모든 타입들을 받을 수 있지만 , 저장된 요소를 꺼낼 때
		// 타입이 달라 여러 문제가 발생(타입 비교 등)
		
		// 다양한 타입의 객체를 다루는 메소드나 컬렉션 클래스에 컴파일 과정에 
		// 타입체크를 해주는 기능을 제네릭이라 한다
		
		// 제네릭의 장점
		// 제네릭 클래스 타입의 객체 생성시 개발자가 원하는 타입을 지정할 수 있음
		// 타입의 안정성이 증대 
		// 의도치 않은 타입의 객체가 저장되는 것을 막아줌 -> 형변환의 오류를 방지
		//	-> 간결한 코드의 유지
		
	}

}
