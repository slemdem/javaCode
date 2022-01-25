package java0120;

public class Entry {
	public String word;
	
	public Entry() {
		System.out.println("***약어사전***");
	}
	
	public Entry(String w){
		this.word=w;
	}
	
	public void writeView() {
		System.out.println("약어 : "+word);
	}

}
