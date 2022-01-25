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
		// ������ �޸� �������� �����͸� ��� �� �����ϰ� �����ϰ� ���� �� �ִ°���
		// �ذ��ϱ� ���� ���Ǵ� ���̺귯��(�ڷᱸ�� ���̺귯��)
		// �ڹٿ��� �����͸� �����ϴ� Ŭ�������� ǥ��ȭ�� ���豸��
		
		// Map, Collection, List, Set
		// List : ������ �ִ� �������� ����
		//	 -> �������� �ߺ� ��� (ArrayList,LinkedList)
		// Set : ������ �������� �ʴ� �������� ����
		//	 -> �������ߺ� ���� (HashSet, LinkedHashSet)
		// Map : Ű(key->�ߺ��Ұ�)�� ��(value)�� ������ �̷���� �������� ����
		
		// Collection �������̽�
		// List�� Set�� ���� �������̽�
		// List�� Set�� ������ ��� Ŭ�������� Collection �������̽��� ��� �� �� �����Ƿ�
		// ����Ŭ������ ������� ������ ������� �����͸� �ٷ� �� ����
		
		// Collection�ȿ� ���� �����͵��� ��� Ÿ���� �����ϴ� ������
		// Ÿ���� �ٸ� ��� �ϰ��� ó���� ������� Ÿ�� �Ķ���Ͷ�� ���� ���
		// ex) Collection<String> c = new HashSet<>();
		//	 -> ������ ���� �ߺ��� ������� �ʴ� �ڷᱸ���� HashSet ��ü�� ����
		//	 -> ����Ǵ� �����ʹ� ���ڿ��� �����Ѵ�
		//	 -> new HashSet<>(); -> �������� -> Ÿ�� �߷�
		Collection<String> c = new HashSet<>(); 
		
		// �÷��� ��ü�� ����
		// �÷��� Ŭ�������� java.util ��Ű���� �����ϰ� ����
		// �÷��� ��ü ��������� �������� ����� ���� �������̽� Ÿ���� �ۼ�
		// ��ü������ �ʿ信 ���� ��ü���� Ŭ�������� ����ϴ� ����
		
		ArrayList<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		// ����ִ� HashSet �ν��Ͻ� ���� �����ʹ� ���� add() �ż��带 ���� ����
		Collection<String> test2 = new HashSet<>(); 
		// �ΰ��� �����͸� ������ List ��ü�� ����
		Collection<String> test1 = Arrays.asList("��","��"); 
		// �����Ͱ� �ϳ��� ������ �ν��Ͻ��� �����ϴ� Set ��ü ����
		Collection<String> test = Collections.singleton("2"); 
		
		// �÷��ǿ� ������ �߰�, ����
		// add : ������ Ÿ���� �����͸� �ϳ��� �߰��� ��
		// addAll : �÷��� Ÿ���� �߰� addAll �޼ҵ带 �̿��� ���� ��Ҹ� ������ �߰�
		test2.add("1");
		test2.add("2");
		test2.add("3");
//		test2.clear();
//		test2.addAll(test1);
		// remove : ��� ����
		// ���� �����͸� ����� ��ȭ ����
//		test2.remove("2");
		//removeall : �ν��Ͻ� ���� ���� ����
		
		// retainAll : �μ��� �����͸� ������ ������ �����͸� ��� ����
		//	 - ���ǻ��� : �μ��� ���� �÷��� Ÿ�� �ν��Ͻ� ���¿��� �Ѵ�
		test2.retainAll(test);
		
		System.out.println(test2);
		
		//size : �÷��� �������� ũ�⸦ ���ϴ� �޼ҵ�
		
		//toArray : �÷����� �迭�� �ٲٴ� �޼ҵ�
		Object[] con1 = test2.toArray();
		// Ư���� Ÿ���� ���Ѵٸ� �ش� ��ü ���� �ڵ带 �־� �־�� �Ѵ�
		String[] con2 =test2.toArray(new String[test2.size()]);
		System.out.println(con1[0]);
		System.out.println(con2[1]);
		
		for(String a:test2) {
			System.out.println(a);
		}
		
		// Ư����ġ �����͸� �ٷ�Ÿ� ���?
		//	 -> �迭�� ġȯ �� ����
		
		// forEach()�޼ҵ� ���
		// test2.forEach(a->System.out.println();
		
		// Iterator ->Collection �������̽��� ��ӹ޴� �������̽�
		// Iterator() �޼ҵ� Ȱ��
		// Iterator : �÷��ǿ� ����ȿ�Ҹ� �о���� ����� �������̽��� ǥ��ȭ
		// Iterator �������̽��� ������ Ŭ������ �ν��Ͻ��� �����ϴ� 
		// (Collection, List, Set���� �̷���� �ν��Ͻ�)
		// iterator
		Iterator iter = test2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
