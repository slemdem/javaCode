package classExam;

import java.util.Scanner;

public class Function {
	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	//1���� �Ѿ�� �Ķ���ͱ����� ���� ����ϴ� �Լ�
	//100 -> ��������� 5050
	
	public static int calSum(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
				
	}
	
	public static int mulNum(int a, int b) {
		int mul = a*b;
		return mul;			
	}
	
	
	public static void main(String[] args) {
		
		// ���� 
		// �Ķ���͸� ���������� 2���� �Է¹޾� 
		// �Է¹��� ���� ���� ����ϴ�
		// mulNum �Լ�
		int result2= mulNum(1, 4);
		System.out.println(result2);
		
		Scanner sc = new Scanner(System.in);
		// �� ���� ���� ���ϴ� �Լ�
		// �μ�(argument)		 = ��, ����, ���� �� �Լ��� ���޵Ǵ� ��
		// �Ű�����(parameter) = �Լ�, �޼��忡�� 
		String hello = "�ȳ��ϼ�";
		
		sayHi(hello);//���� hello�� �Լ� sayHi�� ���޵� �μ�
		sayHi("�𸣰ڳ�..");
		
		int result = calSum(6);
		System.out.println(result);
		
		


		
		

				
	}

}
