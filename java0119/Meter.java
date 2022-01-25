package java0119;

//Meter(택시 미터기)인터페이스는 start와 stop이라는 
//추상 메소드를 가지고 있습니다. 
//	
public abstract interface Meter {
	
	public abstract void start();
	public abstract int stop(int distance);
	
}
