package java0120;

public class Entry {
	public String word;
	
	public Entry() {
		System.out.println("***������***");
	}
	
	public Entry(String w){
		this.word=w;
	}
	
	public void writeView() {
		System.out.println("��� : "+word);
	}

}
