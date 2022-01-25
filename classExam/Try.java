package classExam;

import java.util.Scanner;

//3번 문제
class compute {
	public String item;
	public int qty;
	public int price;
	
	public void varyfy(String compute) {
		
	}
	
	public void computeOut() {
		int resultCost = qty*price;
		System.out.println("품명 : "+item);
		System.out.println("금액 : "+ resultCost + "원");
	}
}
	

public class Try {

	public static void main(String[] args) {
		//3번문제
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("-입력-");
		System.out.printf("품명 : ");
		String itemInput = sc.next();
		System.out.printf("수량 : ");
		int qtyInput = sc.nextInt();
		System.out.printf("단가 : ");
		int priceInput = sc.nextInt();
		
		//업로드
		compute code1 = new compute();
		code1.item = itemInput;
		code1.qty = qtyInput;
		code1.price = priceInput;
		
		//출력
		System.out.println("-출력-");
		code1.computeOut();

	}

}
