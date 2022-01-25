package java0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExam extends CollectionExam {

	public static void main(String[] args) {
		// 리스트 : 중복이 허용되고 저장 순서가 유지되는 구조
		//	-> 구현 클래스 : ArrayList, LinkedList
		
		// add, addAll
		// get() : 지정된 위치에 있는 객체 리턴
		// indexOf() : 객체의 위치 반환
		// lastIndexOf() : List의 마지막 요소부터 역방향으로 위치 리턴
		// listIrerator() : List 객체에 접근하는 ListIrerator를 리턴
		// remove() : 지정된 위치에 있는 객체를 삭제학 삭제된 객체 자체를 리턴
		// set () : 지정된 위치에 객체를 저장
		// sort() : 지정된 값으로 List 요소 정렬
		// subList() : 지정된 범위에 있는 객체를 새로운 List로 리턴
		
		// ArrayList vs LinkedList
		// 공통점
		// 모든 용도에서 사용이 가능, 사용하는 메소드도 똑같음
		
		// 차이점
		// 데이터의 추가나 삭제가 빈번한경우 처리속도 차이가 있음
		
		// LinkedList는 데이터 추가 삭제가 잦은편이면 사용
		// ArrayList는 데이터의 변경이 적은편일때 사용
		
		// ArrayList
		List<String> l1 = new ArrayList<>();
		List<String> l2 = Arrays.asList("오", "육", "칠");
//		List<String> l3 = List.of("쓰리", "포");
		
		l1.addAll(l2);
		l1.add("팥");
		System.out.println(l1);
		
		// LinkedList
		LinkedList<String> Llist1 = new LinkedList<>();
		
		Llist1.addAll(l2);
		Llist1.add("링크드리스트");
		
		//get을 통해 리스트의 위치 가져오기
		System.out.println(Llist1.get(3));
		
		// indexOf를 이용해서 요소의 위치 확인 
		// 만약 없는 요소면 -1 출력
		System.out.println(Llist1.indexOf("팥"));
		
		// lastIndexOf
//		System.out.println(Llist1.lastIndexOf("링크드리스트"));
		
//		String test = "abcabc";
//		System.out.println(test.indexOf("c"));
//		System.out.println(test.lastIndexOf("c",2));
		
		LinkedList<Integer> lList1 = new LinkedList<Integer>();
		lList1.add(10);
		lList1.add(20);
		lList1.add(30);
		lList1.add(40);
		ListIterator<Integer> iter = lList1.listIterator();
		
		// hasNext() : 리스트 반복자가 해당 리스트를 순방향으로 순회할 때
		// 다음 요소가 있으면 True 없으면 False
		while (iter.hasNext()) {
			//next() 리스트의 다음 요소를 리턴하고 순방향이동 진행
			System.out.println(iter.next());
		}
		// hasPrevious() : 리스트 반복자가 해당 리스트를 역방향으로 순회할 때
		// 다음 요소가 있으면 True 없으면 False
		while (iter.hasPrevious()) {
			//previous() 리스트의 이전 요소를 리턴하고 역방향이동 진행
			System.out.println(iter.previous());
		}
		
		
		// remove : 해당 리스트의 요소의 번지수를 찍어 해당 내용을 리턴받고 그 리스트에서 해당 요소 제거
		System.out.println(Llist1.remove(2));
		System.out.println(Llist1);
		// set : 해당 리스트의 요소의 번지수를 찍어 해당 내용을 변경
		Llist1.set(0,"five");
		System.out.println(Llist1);
		
		//sort
		Llist1.clear();
		
		List<Integer> test1 = Arrays.asList(1,2,3,4,5);
		
		//sort : 기본적으로 오름차순 정렬
		Collections.sort(test1);
		System.out.println(test1);
		
		//sort로 내림차순 정렬
		test1.sort(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return o2.toString().compareTo(o1.toString());
			}
		});
		Collections.sort(test1,Collections.reverseOrder());
		
		System.out.println(test1);
		
	}

}
