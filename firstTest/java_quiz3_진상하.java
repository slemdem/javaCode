package firstTest;

import java.util.Scanner;

public class java_quiz3_������ {
	public static double area;
	public static double PI = 3.141592;
	static Scanner scn = new Scanner(System.in);
	public static double n1;
	public static double n2;
	public static double n3;
	
	//area �ʱ�ȭ
	public static void reset() {
		area=0;
	}
	
	//������ ���� �Է�&���
	public static void triangle(){
		reset();
		System.out.println("**** �ﰢ���� ���� ***");
		System.out.printf("�غ� : ");
		n1 = scn.nextInt();
		System.out.printf("���� : ");
		n2 = scn.nextInt();
		area = n1*n2/2;
		
		output(area);
	}
	public static void circle(){
		reset();
		System.out.println("**** ���� ���� ***");
		System.out.printf("������ : ");
		n1 = scn.nextInt();
		area = n1*PI;
		
		output(area);
	}
	public static void trape(){
		reset();
		System.out.println("**** ��ٸ����� ���� ***");
		System.out.printf("�Ʒ��� : ");
		n1 = scn.nextInt();
		System.out.printf("���� : ");
		n2 = scn.nextInt();
		System.out.printf("���� : ");
		n3 = scn.nextInt();
		area = (n1+n2)/2*n2;
		
		output(area);
	}
	
	//����Լ�
	public static void output(double a) {
		System.out.printf("���� : ");
		System.out.println(a);
		
	}
	
	public static void int_menu() {
		System.out.println("**** �������� ****");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		System.out.printf("���� : ");
		int a;
		a = scn.nextInt();
		System.out.println();
		
		if (a==1) {
			triangle();
		}
		else if (a==2) {
			circle();
		}
		else if (a==3) {
			trape();
		}
		else if (a==4) {
			System.out.println("�����մϴ�");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
		
	}
	

	public static void main(String[] args) {
		int_menu();
	}

}
