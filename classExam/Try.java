package classExam;

import java.util.Scanner;

//3�� ����
class compute {
	public String item;
	public int qty;
	public int price;
	
	public void varyfy(String compute) {
		
	}
	
	public void computeOut() {
		int resultCost = qty*price;
		System.out.println("ǰ�� : "+item);
		System.out.println("�ݾ� : "+ resultCost + "��");
	}
}
	

public class Try {

	public static void main(String[] args) {
		//3������
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		System.out.println("-�Է�-");
		System.out.printf("ǰ�� : ");
		String itemInput = sc.next();
		System.out.printf("���� : ");
		int qtyInput = sc.nextInt();
		System.out.printf("�ܰ� : ");
		int priceInput = sc.nextInt();
		
		//���ε�
		compute code1 = new compute();
		code1.item = itemInput;
		code1.qty = qtyInput;
		code1.price = priceInput;
		
		//���
		System.out.println("-���-");
		code1.computeOut();

	}

}
