	package java0120;

import java.util.ArrayList;
import java.util.List;

class GenericTest<T> {
	// �Ϲ������� <T>�� ���
	// T�� ��üŸ�Ը� �����ؼ� Integer Ŭ������ ����ؾ� �������� ���� �� ����
	// T�� �ν��Ͻ� ������ ���ֵȴ�
	//	 -> static���� ��� �Ұ�
	// ���׸� �迭 ������ �Ұ���
	// new, instanceOf �����ڴ� T�� �ǿ����ڷ� ��� �Ұ�
	T item;
	
	// ���׸� �޼���
	// �޼ҵ��� �Ķ����, Ȥ�� ���Ͽ� ���׸��� ���� �� ����
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	// ���ϵ� ī��
	// ?�� �̿��ؼ� Ÿ���� ���� �����Ӱ� ����� �� ������
	// �����ε��� ������� �ʴ´�.
	// ? : object
	
	@SuppressWarnings("hiding")// �ʿ���°� �ִ�
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
		// Generic : �Ķ���͸� �޾ƿ� �� �������� Ÿ������ üũ�� �ִµ���
		// <   >   <-----�̷��� ����
		// Ÿ���� �������� ���� ���׸��� �ʿ�
		// ������ �ڵ忡���� ũ�� �������� ����
		// ������ ����������� �������� ���޵Ǵ� ��ü�� �����ؾ� �� �� 
		// �߸��� Ÿ���� ���޵Ǹ� ������ '�ɰ�'������
		
		// col�̶�� ��ü�� �����ϴµ� red��� ���ڿ� �����Ͱ� ���� ���
		// ���� ���ڿ����� �߸��ƴٸ� �����߿� ������ �߻�
		// Color color = new Color("red");
		// �����Ͱ� ������ �� �ִ� Ŭ������ ����� ���׸��� ����ؼ� Ÿ�Թ����� ������ �� �ִ�
//		Color col = new Color<Color.red>;
		
		// ArrayList�� ��� Ŭ������ Object Ÿ���� �����͸� ������ �� �ִ�
		// Object Ŭ������ �ֻ��� Ŭ����(��� �ڹ� Ŭ������ ����Ŭ����)
		//	 -> ������ ��� �ڹ� Ŭ������ ��ҷ� �� �� �ִ�
		// ArrayList�� ��� Ÿ�Ե��� ���� �� ������ , ����� ��Ҹ� ���� ��
		// Ÿ���� �޶� ���� ������ �߻�(Ÿ�� �� ��)
		
		// �پ��� Ÿ���� ��ü�� �ٷ�� �޼ҵ峪 �÷��� Ŭ������ ������ ������ 
		// Ÿ��üũ�� ���ִ� ����� ���׸��̶� �Ѵ�
		
		// ���׸��� ����
		// ���׸� Ŭ���� Ÿ���� ��ü ������ �����ڰ� ���ϴ� Ÿ���� ������ �� ����
		// Ÿ���� �������� ���� 
		// �ǵ�ġ ���� Ÿ���� ��ü�� ����Ǵ� ���� ������ -> ����ȯ�� ������ ����
		//	-> ������ �ڵ��� ����
		
	}

}
