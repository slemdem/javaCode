package java0121;

public interface Operate {
	int operate(int a,int b);
	
	default void print() {
		System.out.println("test");
	}
	
}
