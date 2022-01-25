package java0119;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		
		// ���� (exeption): ���α׷� ���� �� �߻��ϴ¿���ġ ���� ��Ȳ
		// �ڹٿ��� ��� ����, ���ܴ� Throwable Ŭ������ ���� ó��
		// Throwable Ŭ������ ���� �̿��� ���� ���� �幰��
		
		// ���� �� �� �ִ� ���� ����
		// 1. OutOfMemoryError
		//	 - �ڹ� ����ӽ� �޸𸮰� �����Ͽ� �ν��Ͻ� �Ҵ��� �Ұ����ϰ�
		//	   ������ �÷��Ͱ� �޸𸮸� ����� �� ���� �� �߻�
		
		// Exception
		// ���α׷� ������ ����� �� �ִ� ������ �����Ǿ� ����ó���� 
		// ���������� �����ϰų� �� �ؾ��Ѵٴ� Ŭ�������� ����Ŭ����()
		// Exception���� Checked Exception�� Unchecked Exception�� �ְ�
		// Checked Exception������ �ݵ�� ����ó���� �ؾ� �������� �����ϴ�
		
		// Checked Exception - ���������� ExceptionŬ������ ��ӹ޴� ���
		// UnChecked Exception - RuntimeExceptionŬ������ ��ӹ޴� ���
		
		// Checked Exception - try catch ������ ����ؼ� �ۼ�
//		try {
//			���� ������ �߻����� ���� ��� ����� �ڵ�
//		} catch(Exception e){
//			try ���ȿ��� ���ܰ� �߻��� ����� �ڵ�
//		}
		// ����ó���� ��Ʈ�� �� �� ���� ����
		// 1. IOExeption
		// ����°� ���õ� ����
		// 2. Interrupted Exception
		// ������ ���� ����
		
		// UnChecked Exception 
		// 1. RuntimeException
		// ExceptionŬ������ ���� ��� ���� �� ����
		// RuntimeException -> �� Ŭ������ ��ӹ����� try - catch�� ������ �������� �ʾƵ� �ȴ�
		
		// 2. NullPointerException
		// �ڷ��� ������ �ν��Ͻ��� ����Ǿ� ���� �ʰ� null�� �ִٸ�
		// �ν��Ͻ� �޼ҵ带 ȣ��, ���� ���ٽ� �߻��ϴ� ����
		
		// 3. ClassCastException
		// ��üŸ�� ��ȯ�� �ùٸ��� ���� ��ü�� Ÿ�Ժ�ȯ�� ��� �߻��ϴ� ����
		
		// ���ܹ߻� Ȯ�ι�
		int num=-1;
		int[] array = new int[3];
//		System.out.println(array[num]);
//		try {
//			System.out.println(array[num]);
//		} catch(ArrayIndexOutOfBoundsException ea){
//			System.out.println("����!");//���� �޼��� Ȯ�� ����ϰ� �������� ���� ��ݻ���
//		}
		
		Scanner sc = new Scanner(System.in);
		int a=0;
		while (a<2) {
			try {
				int value = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("���ڰ� �ԷµǾ����ϴ� ���ڸ� �Է��ϼ���");
			}
			a+=1;
					
		}
		
		//����ó���� ����ؾ��� ����
		// ��� ���ܸ� üũ�ϴ� ���� ��ƴ�
		
		// ������ ���ܰ� �߻��� ���ɼ��� ���ٰ� ������� 
		// RuntimeException Ŭ������ ���� ���ܿ� �����ϴ� ����� ����
		//	=>������ �������̸� ���� �������� ������ Exception�� ã�°��� ���� ����
		
		//Ŀ���� ���� throw
//		ExeptionTest ext = new ExeptionTest();
//		ext.setName("test");
		
		// �ڹٿ��� ������ 0�� �ϸ� ��� �ɱ�?
		// �����߻�
//		System.out.println(4/0);
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			int firDiv;
//			int secDiv;
//			
//			try {
//			System.out.println("������");
//			firDiv = sc.nextInt();
//			System.out.println("����");
//			secDiv = sc.nextInt();
//			int result = firDiv/secDiv;
//			System.out.printf("%d / %d = %d \n",firDiv,secDiv,result);
//			
//			} catch(ArithmeticException e) {
//				System.out.println("0���� ������������");
//				continue;
//			}
//		}
		
	}

}
