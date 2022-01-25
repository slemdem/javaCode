package java0120;

public class SubEntry extends Entry {
	String definition;
	int year;
	
	SubEntry(String w){
		super.word = w;
	}
	
	SubEntry(String w, String d, int y){
		super.word = w;
		this.definition =d;
		this.year = y;
	}
	public void printVeiw() {
		super.writeView();
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year + "년");
	}
	
	public static void main(String[] args) {
		SubEntry SE = new SubEntry("OOP", "Object Oriented Programming", 1991);
		SE.printVeiw();
	}

}
