package presentation;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkJungWonQ0112 {

	public static void main(String[] args) {
		// find_biggest method�� �����ϱ� ���� Q0112 class�� instance ����
		ParkJungWonQ0112 q = new ParkJungWonQ0112();
		// find_biggest_num�̶�� int[]�� �޾Ƽ�
		int[] find_biggest_num = {9, 5, 3, 55};
		// argument�� �־���
		// return ���� int type�̱� ������ int answer�� �޾Ƽ� print����
		int answer = q.find_biggest(find_biggest_num);
		System.out.println(answer);

	}
	
	public int find_biggest(int[] find_biggest_num) {
		
		/* Ǯ�� ���
		   (1) ���� ���� ��� ���� ���ϴ� ����� �����غ����� ��
		     => ������ �̴� �ʹ� ��ȿ������ ���
		     => �츮�� ��ǥ�� find_biggest ���� return�ϴ� ���̱� ����
		   (2) �ִ밪�� ã��
		     => find_biggest_num �߿��� ���� ���ڰ� ū �͵��� ������� �����ϸ� ��
		 */
		
		// find_biggest_num�� �� ���� [a,b,c,d]�� ���·� �ִ� array�� ����
		int[][] dataOrganization = new int[find_biggest_num.length][4];
		
		// data_org��� Array�� ���� ����
		for(int i=0; i<find_biggest_num.length; i++) {
			// �켱 find_biggest_num[i] �ϳ��� String���� casting����
			String temp1 = Integer.toString(find_biggest_num[i]);
			// ��ĭ�� �������� ����� �տ�������
			String temp2 = String.format("%-4s",temp1);
			// temp2�� split�ؼ� array�� �����
			String[] temp3 = temp2.split("");
			// �� String[]�� int[]�� �ٲ���ϱ⿡ ������ -1�� ��ȯ
			for(int x=0;x<4;x++) {
				if(temp3[x].equals(" ")) {
					temp3[x]="-10";
				}
			}
			// ���� temp3�� int[]�� �ٲ��� �� data_org[i]�� �����
			dataOrganization[i]=Arrays.stream(temp3).mapToInt(Integer::parseInt).toArray();
		}
		
		// ��ġ�� �� �� �� ����������
		// �׸��� �� �ĺ��� �߿��� sort�� �ؼ� ���� ��������
		ArrayList<String> answers = new ArrayList<>();
		
		// �����ϰ� ���� answers�� �ĺ����� �� ���� ��
		String now = "";
		choose(-1, dataOrganization, find_biggest_num, now, answers);
		
		// answers�� String[] ���� �ٲٰ� �װ� �ٽ� int[]�� �ٲ���
		String[] temp = answers.toArray(new String[answers.size()]);
		int[] ansCand = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
		// �׸��� �� �迭�� ����
		Arrays.sort(ansCand);
		
		// ������������ ���ĵǾ� �ֱ� ������ �� ���� ���� return�ϸ� ������ ���� ����
		int biggest_num = ansCand[ansCand.length-1];
		return biggest_num;
	}
	
	private void choose(int index, int[][] dataOrg, int[] find_biggest_num, String now, ArrayList<String> answers) {
		// �̹� ���� index�� ���� -10���� �����ع���
		// �� ���� �ƴ� �� ó���� �� ������ ����̱� ����
		if(index>=0) {
			dataOrg[index][0] = -10;
		}
		
		// ������ index�� value�� ��� variable
		int fstInd = -1;
		int fstVal = -1;
		// ���� ū ���� ���� ã��
		for(int i=0;i<dataOrg.length;i++) {
			if(dataOrg[i][0]>fstVal) {
				fstInd = i;
				fstVal = dataOrg[i][0];
			}	
		}
		
		// ���ٸ� �����ؾ� �� ���� (���� �� -10�̶�� ���̴ϱ�)
		if(fstInd==-1) {
			answers.add(now);
			return;
		}
		
		// ��ġ�°� �ִ� ���
		for(int i=0;i<dataOrg.length;i++) {
			if(dataOrg[i][0]==fstVal) {
				String temp = now + find_biggest_num[i];
				// * ����: ���߹迭�� .clone()�� �ᵵ ���� ���簡 ���� �ʴ´�! * 
				choose(i, deepClone(dataOrg), find_biggest_num, temp, answers);
			}	
		}
		return;
	}
	
	// �������迭�� ���� ���縦 ���� method
	private int[][] deepClone(int[][] mA) {
		int[][] dC = new int[mA.length][mA[0].length];
		for(int i=0; i<mA.length; i++){
			dC[i]=mA[i].clone();
		}
		return dC;
	}
}
