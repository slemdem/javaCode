package exam1;

import java.util.Scanner;

public class Afternoon_Q_1_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("����� ���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("����� Ű�� �Է��ϼ���");
		float hight = sc.nextFloat();
		System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���");
		String phoneNum = sc.next();
		System.out.println("����� �����Ը� �Է��ϼ���");
		float weight = sc.nextFloat();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + hight);
		System.out.println("��ȭ��ȣ : " + phoneNum);
		System.out.println("������ : " + weight);
		

	}

}
