package classExam;

class Person{
	final String nation;
	static final String SSN ="594315-481357";//주민등록번호를 상수방식으로 전환
	String name;
	
	public Person( String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
}

public class finalExample {

	public static void main(String[] args) {
		//final의 값을 선언해 두지 않았으면 입력 가능
		Person p1 = new Person("김코딩" , "인도");
		Person p2 = new Person( "세르코비치" , "러시아");
		System.out.println(p1.nation);
		System.out.println(p1.SSN);
		System.out.println(p1.name);

//		p1.nation = "러시아";//final은 수정불가 final의 값을 선언해 두지 않았으면 입력 가능
//		p1.ssn = "594315-481357";
//		p1.name ="세르코비치";
		System.out.println(p2.nation);
		System.out.println(p2.SSN);
		System.out.println(p2.name);
	}

}
