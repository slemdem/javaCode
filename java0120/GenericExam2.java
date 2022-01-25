package java0120;

import java.util.ArrayList;

class Box<T>{
	T boxitem;
	T[] itemArr; //T의 배열을 위한 필드
	
	ArrayList<T> list1 =new ArrayList<T>();
	
	void setItem(T item) {
		this.boxitem = item;
	}
	
	T getItem() {
		return boxitem;
	}
	
	void add(T item) {
		list1.add(item);
	}
	int size(){
		return list1.size();
	}
	T get(int i) {
		return list1.get(i);
	}
	
	ArrayList<T> getList() {
		return list1;
	}
	
	public String toString() {
		return list1.toString();
	}
	
}

class Fruit{
	public String toString() {
		return "Fruit";
	}
	
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
	
}

public class GenericExam2 {

	public static void main(String[] args) {
		Box<Apple> appleBox = new Box<Apple>(); //타입을 일치시켜야 한다
		
		appleBox.add(new Apple()); // 타입을 일치시켜야 한다
		
		System.out.println(appleBox.get(0));
		
		Box<Integer> b = new Box<>();
		
		b.setItem(12345678);
		System.out.println(b.getItem());
		
		
		
		
	}

}
