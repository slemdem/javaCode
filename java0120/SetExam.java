package java0120;

import java.util.LinkedHashSet;

public class SetExam {

	public static void main(String[] args) {
		// Set
		// list와 유사한 형태지만 중복이 허용되지 않고 순서가 유지되지 않는 특징을 가진 인터페이스
		// HashSet
		// 순서가 필요한 경우 LinkedHashSet, SortedSet, Treeet
		
		// list와 마찬가지로 타입선언은 인터페이스 타입으로 
		// 객체생성은 HashSet이나 LinkedHashSet을 사용하는 형태
		//Set<String> s1 = new HashSet<>();
		//Set<String> s2 = Set.of("three","four");
		
		LinkedHashSet<String> l1 = new LinkedHashSet<>();

	}

}
