package firstTest;

import java.util.Random;
import java.util.Scanner;


public class java_quiz1_������ {

	public static void main(String[] args) {
		
		// ���� �߻�
        Random a = new Random();
        int b = a.nextInt(25); 
        int input;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("0~25�� ������ �߻��Ͽ����ϴ�.���߾� ������.");
        
        //���ڸ� ���ߴ� ����
      	for(;;) {
      		System.out.printf("���� �Է� :");
      		input=scn.nextInt();
      		
      		//����
      		if(input == b) {
      				break;
      		} // ����
      		else if (input != b) {
      			System.out.println("Ʋ�Ƚ��ϴ� �ٽ� �Է��ϼ���");
      		}//if end
      			
      	}//for end
      		
      	System.out.printf("������ ���߼̽��ϴ�");

	}

}
