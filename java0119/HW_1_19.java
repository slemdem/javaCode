package java0119;

class Div{
	public int inputNum;
	
	// �Է¹޴� ������ ������ ���� �ݺ�
	public int until (int inputNum) {
		int remains = 0;
		for (int i = 1; i<=inputNum; i++) {
			int remain = inputNum % i;
			
			// �������� 0�� �Ǵ� ���ڵ��� ����
			if (remain ==0) {
				remains += i;
			}//if end
			
		}//for end
		//����
		return remains;
	}
}

public class HW_1_19 {
	// � �ڿ����� �Է¹޾Ƽ� 
	// �ش� �ڿ����� ����� ���Ͻð�
	// �׸��� �� ����� ��� ���� ���� ���Ϲ޾� ������
	// (�޼ҵ� �����ؼ� ó��)-> �޼ҵ���� ����

	public static void main(String[] args) {
		
		Div n1 = new Div();
		
		int a = 60;
		
		System.out.println(n1.until(a));
		
		int answer=1+2+3+4+5+6+10+12+15+20+30+60;
		System.out.println(answer);
		
	}

}
