package firstTest;

public class App_By_stack implements Make_Stack {
	public App_By_stack(int num) {
	      Make_Stack.num = num;
	      Make_Stack.top = 0;
	      arr = new String[num];
	   }
	
	public static int length(){
		int l = 0;
		for (int i=0; i<=arr.length;) {
		l++;
		}
		return l;
	}

	@Override
	public String pop() {
		if(top -1 < 0) {
			top--; 
			String t = arr[top]; 
			return t;
		}else {
		return null;
		}
		
	}

	@Override
	public boolean push(String val) {
		if(top < num) {
			arr[top] = val; //¸Ç À§¿¡ ¹®ÀÚ¿­À» ³Ö¾îÁÜ
			top++; // stack ÇÑÄ­À» ¿Ã·ÁÁÜ
	        return true;
		}
		else {
	          return false;
		}
		
	}
	
	
	
}
