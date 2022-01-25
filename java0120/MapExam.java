package java0120;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		//Map : key, value ������ ������ ���� �������̽�
		// Collection �������̽��� ��ӹ��� �ʰ�
		// �� ��ü�� �������̽��� �������� Map ���� Ŭ������ ������ ����
		// HashMap
		
		//Map ��� ����
		// ����� �̸��� ��������� �Է¹޴� ��
		Map<String,String> map1= new HashMap<>();
		// put : ���ο� ��Ҹ� �߰��� �� ���
		map1.put("����", "20121015");
		map1.put("�Ƿη�", "20120114");
		map1.put("���ù�", "19800102");
		map1.put("�����ΰ�", "1002030");

		//		// get : Ư�� key�� �ش��ϴ� ���� ������ ��
//		// �ߺ��� key���� �ִٸ� ���� �������� ���� �����͸� ����
//		System.out.println(map1.get("�Ƿη�"));
//		System.out.println(map1);
//		//remove : Map ��� ����
//		map1.remove("�Ƿη�");
//		System.out.println(map1);
		
		//entrySet
//		for(Map.Entry<String, String> ent : map1.entrySet()) {
//			System.out.printf("%s : %s\n",ent.getKey(), ent.getValue());
//		}
//		
//		System.out.println("==========================================");
//		System.out.println(map1.keySet());
//		System.out.println(map1.values());
//		
//		for(String s : map1.keySet()) {
//			System.out.println(s);
//		}
//		for(String s : map1.values()) {
//			System.out.println(s);
//		}
		
		// �������� ���α׷� �ٲٱ�
		// ��������� ������ List�� �л��̸��� ����ϴ� Map
		// �������
		List<Integer> result1 =Arrays.asList(80,90,55,60,75);
		
		Map<String,List<Integer>> student = new HashMap<>();
		student.put("������, ", result1);
		
		int total = 0;
		
		for(int i : student.get("������, ")) {
			total+=i;
		}
		
		System.out.println("���� : "+total); 
	}

}
