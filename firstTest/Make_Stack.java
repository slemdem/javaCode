package firstTest;

public abstract interface Make_Stack {
	public static final String[] arr = null;
	public static final int top = 0;
	public static final int num = 0;
	
	public static int length(){
		int l = 0;
		return l;
	}
	
	public static int capacity() {
		return arr.length;
	}
	
	public abstract String pop();
	
	public abstract boolean push(String val);

}
