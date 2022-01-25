package firstTest;

import java.util.Scanner;

public class java_quiz4_진상하  {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
	      int num = sc.nextInt();
	      App_By_stack arr = new App_By_stack(num);
	      while(true) {
	         System.out.print("문자열 입력 >> ");
	         String val = sc.next();
	         if(val.equals("그만"))
	            break;
	         if(!arr.push(val)) {
	            System.out.println("스택이 꽉 차서 푸시 불가!");
	         }
	      }
	      System.out.print("스택에 저장된 모든 문자열 팝 : ");
	      int l = arr.length();
	      for(int i=0; i<l; i++) {
	         String s = arr.pop();
	         System.out.print(s+" ");
	      }
	      sc.close();
	   }

	

}
