package java0119;

class Div{
	public int inputNum;
	
	// 입력받는 수까지 나누기 무한 반복
	public int until (int inputNum) {
		int remains = 0;
		for (int i = 1; i<=inputNum; i++) {
			int remain = inputNum % i;
			
			// 나머지가 0이 되는 숫자들을 더함
			if (remain ==0) {
				remains += i;
			}//if end
			
		}//for end
		//리턴
		return remains;
	}
}

public class HW_1_19 {
	// 어떤 자연수를 입력받아서 
	// 해당 자연수의 약수를 구하시고
	// 그리고 그 약수를 모두 더한 값을 이턴받아 보세요
	// (메소드 생성해서 처리)-> 메소드명은 자유

	public static void main(String[] args) {
		
		Div n1 = new Div();
		
		int a = 60;
		
		System.out.println(n1.until(a));
		
		int answer=1+2+3+4+5+6+10+12+15+20+30+60;
		System.out.println(answer);
		
	}

}
