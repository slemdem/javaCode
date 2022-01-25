package classExam;

public class Pilgen {
	    // �����ϰ��� �ϴ� ��� ����.
	static int[] target = new int[] { 20, 97, 43, 13, 36 };
	    // ��� ���ڸ� �����ߴ����� �˷��ִ� ����.
	static boolean[] visited = new boolean[target.length];
	static String st = "";

	public static void main(String[] args) {
		permutation(0, st);
		String[] div = st.split(" ");
		long[] numbers = new long[div.length];
		for (int i=0; i<div.length; i++) {
			numbers[i] = Long.parseLong(div[i]);
		}
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		long find_biggest_num = find_biggest(numbers);
	        System.out.println();
	        System.out.println(find_biggest_num);
	    }
	    private static long find_biggest(long[] numbers) {
	    	long mx = -1;
	    	for (int i=0; i<numbers.length; i++) {
	    		if (numbers[i] > mx) {
	                mx = numbers[i];
	            }
	        }
	        return mx;
	    }
	    // ���� �޼���(cnt�� ���� Ƚ��, result�� ���)
	    private static void permutation(int cnt, String result) {
	        // 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
	    	if (cnt == target.length) {
	    		st += result;
	    		st += " ";
	    		return;
	        }
	        // ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
	        for (int i = 0; i < target.length; i++) {
	            // �̹� �ش� ���ڸ� ������ ��쿡�� ��ŵ.
	        	if (visited[i]) {
	            	continue;
	        	}
	        	// �������� �������, �����ߴٴ� ǥ�ø� ���ش�.
	        	visited[i] = true;
	        	// �ڽ��� ��� ȣ���Ѵ�.
	        	permutation(cnt + 1, result + target[i]);
	        	// ������ �����Ѵ�.
	        	visited[i] = false;
	        }
	    
	}

}
