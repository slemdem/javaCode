package firstTest;

import java.util.Scanner;

public class java_quiz4_������  {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
	      int num = sc.nextInt();
	      App_By_stack arr = new App_By_stack(num);
	      while(true) {
	         System.out.print("���ڿ� �Է� >> ");
	         String val = sc.next();
	         if(val.equals("�׸�"))
	            break;
	         if(!arr.push(val)) {
	            System.out.println("������ �� ���� Ǫ�� �Ұ�!");
	         }
	      }
	      System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
	      int l = arr.length();
	      for(int i=0; i<l; i++) {
	         String s = arr.pop();
	         System.out.print(s+" ");
	      }
	      sc.close();
	   }

	

}
