package exam1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Array
		// �迭 : ���� Ÿ���� ������� �̷���� ����
		// �迭�� �����ϴ� ������ ��
		// �迭���� ��ġ�� ����Ű�� ����
		// �迭�� �����ϴ� ������ �� : ���(element)
		// �迭���� ��ġ�� ����Ű�� ���� : �ε���(index)
		
		// �迭�� ����� ���ÿ� �ʱ�ȭ �ϴ� ���̽�
		int[] number = {10, 20, 30}; // [],{} �ʱ�ȭ ���
		int[] number2 = new int[] {20, 30, 40};
		//System.out.println(number[2]);
		
		// �迭 ���� �� �ε��� ���� �ʱ�ȭ�ϴ� ���̽�
		String[] str1 = new String[2];
		
		str1[0] = "80"; 
		str1[1] = "90"; 
		//System.out.println(str1[1]);
		 
		// ����
		// str1[2] = "test";
		// System.out.println(str1[2]);�϶�
		// ���� : ����
		// ���� : ���� �ʰ� (str1 �迭)
		
		//str1[0] = "80";
		//str1[1] = "90";
		//System.out.println(str1[0]);
		// null�� ��µǰ� ��
		
		// �迭�� ����
		// 1. �迭�� �Է¹��� ��ҵ��� ���հ� ��� ���ϱ�
		
		int[] number3 = new int[] {85,75,45};
		int sum=0;
		
		for(int i=0; i<number3.length; i++) {
			sum +=number[i];
		};
		// ����
		System.out.println(sum);
		
		// ������ �迭
		// 2���� �̻��� �迭 : �迭��ҷ� �Ǵٸ� �迭�� ������ �迭
		
		// 2���� �迭�� ����
		// Ÿ��[][] �迭��;
		// Ÿ�� �迭��[][];
		// Ÿ��[] �迭��[];
		
		int[][] di_arr = {
				{10, 30, 50},
				{15, 25, 35}
		};
		System.out.println(di_arr[1][1]);
		
		// �����迭
		// ���� ���̸� ������� �ʰ� �ึ�� �ٸ������� �迭�� ��ҷ� �����ϴ� �迭
		// int[][] arr2 = new int[3][];
		int[][] arr2 = {
				{10, 15},
				{10, 20, 30, 45},
				{10}
		
		};
		System.out.println(arr2[1][3]);
		
		// �迭�� ����
		// �ڹٿ��� �迭�� ������ ���̸� �����ϱⰡ �ſ� ��ƴ�
		// � �迭���� ���� �����͸� �����ϱ� ���� ���� �迭�� �����͸� ���Ӱ� �ű� �迭�� ����
		
		// arraycopy, copyof, clone
		
		// for�� + index ����
		
		
		int[] arr3 = new int[] {1,2,3,4,5}; int nlength = 10;
		  
		int[] newArr1 = new int[nlength]; //arraycoppy(�����迭, �ű�迭, �ű����)
		  
		//System.arraycopy(arr3, 0, newArr1, 2, arr3.length);
		  
		//for(int i=0; i<newArr1.length; i++) { 
		//  System.out.println(newArr1[i] + " ");
		//};
		 
		  
		  //copyOf
		int[] arr4 = Arrays.copyOf(arr3,nlength);
		
		for (int i=0; i<arr4.length; i++) { 
			System.out.println(arr4[i] + " ");
		 };
		 
		//clone
		 int[] arr5 = (int [])arr3.clone();
			
		for (int i=0; i<arr5.length; i++) { 
			System.out.println(arr5[i] + " ");
		 };
			 
		
		
		}
}
