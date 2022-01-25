package java0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionExam {

	public static void main(String[] args) {
		// Collection : 
		// 한정된 메리 공간에서 데이터를 어떻게 잘 관리하고 저장하고 꺼낼 수 있는가를
		// 해결하기 위해 사용되는 라이브러리(자료구조 라이브러리)
		// 자바에서 데이터를 저장하는 클래스들을 표준화한 설계구조
		
		// Map, Collection, List, Set
		// List : 순서가 있는 데이터의 집합
		//	 -> 데이터의 중복 허용 (ArrayList,LinkedList)
		// Set : 순서를 유지하지 않는 데이터의 집합
		//	 -> 데이터중복 불허 (HashSet, LinkedHashSet)
		// Map : 키(key->중복불가)와 값(value)이 쌍으로 이루어진 데이터의 집합
		
		// Collection 인터페이스
		// List와 Set의 상위 인터페이스
		// List와 Set을 구현한 모든 클래스들은 Collection 인터페이스를 사용 할 수 있으므로
		// 구현클래스와 상관없이 동일한 방법으로 데이터를 다룰 수 있음
		
		// Collection안에 들어가는 데이터들은 모든 타입이 가능하다 하지만
		// 타입이 다른 경우 일관된 처리가 어려워서 타입 파라미터라는 것을 사용
		// ex) Collection<String> c = new HashSet<>();
		//	 -> 순서는 없고 중복은 허용하지 않는 자료구조인 HashSet 객체를 생성
		//	 -> 저장되는 데이터는 문자열로 한정한다
		//	 -> new HashSet<>(); -> 생략가능 -> 타입 추론
		Collection<String> c = new HashSet<>(); 
		
		// 컬렉션 객체의 생성
		// 컬렉션 클래스들은 java.util 패키지가 포함하고 있음
		// 컬렉션 객체 생성방법은 참조변수 선언시 상위 인터페이스 타입을 작성
		// 객체생성은 필요에 따라 구체적인 클래스들을 사용하는 형식
		
		ArrayList<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		// 비어있는 HashSet 인스턴스 생성 데이터는 직접 add() 매서드를 통해 삽입
		Collection<String> test2 = new HashSet<>(); 
		// 두개의 데이터를 가지는 List 객체를 생성
		Collection<String> test1 = Arrays.asList("일","이"); 
		// 데이터가 하나인 유일한 인스턴스를 보장하는 Set 객체 생성
		Collection<String> test = Collections.singleton("2"); 
		
		// 컬렉션에 데이터 추가, 삭제
		// add : 지정된 타입의 데이터를 하나씩 추가할 때
		// addAll : 컬렉션 타입을 추가 addAll 메소드를 이용해 개별 요소를 꺼내서 추가
		test2.add("1");
		test2.add("2");
		test2.add("3");
//		test2.clear();
//		test2.addAll(test1);
		// remove : 요소 삭제
		// 없는 데이터를 지우면 변화 없음
//		test2.remove("2");
		//removeall : 인스턴스 관련 내용 삭제
		
		// retainAll : 인수의 데이터를 제외한 나머지 데이터를 모두 삭제
		//	 - 주의사항 : 인수의 값이 컬렉션 타입 인스턴스 형태여야 한다
		test2.retainAll(test);
		
		System.out.println(test2);
		
		//size : 컬렉션 데이터의 크기를 구하는 메소드
		
		//toArray : 컬렉션을 배열로 바꾸는 메소드
		Object[] con1 = test2.toArray();
		// 특정한 타입을 원한다면 해당 객체 생성 코드를 넣어 주어야 한다
		String[] con2 =test2.toArray(new String[test2.size()]);
		System.out.println(con1[0]);
		System.out.println(con2[1]);
		
		for(String a:test2) {
			System.out.println(a);
		}
		
		// 특정위치 데이터만 다룰거면 어떻게?
		//	 -> 배열로 치환 후 접근
		
		// forEach()메소드 사용
		// test2.forEach(a->System.out.println();
		
		// Iterator ->Collection 인터페이스가 상속받는 인터페이스
		// Iterator() 메소드 활용
		// Iterator : 컬렉션에 저장된요소를 읽어오는 방법을 인터페이스로 표준화
		// Iterator 인터페이스를 구현한 클래스의 인스턴스를 리턴하는 
		// (Collection, List, Set으로 이루어진 인스턴스)
		// iterator
		Iterator iter = test2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
