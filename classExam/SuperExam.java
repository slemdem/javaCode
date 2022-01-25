package classExam;

class People{
	public String name;
	public String phone;
	
	public People(String name , String phone) {
		this.name = name;
		this.phone = phone;
	}
}

class Student extends People{
	public int stuNo;
	
	public Student(String name , String phone, int stuNo) {
		super(name,phone);
		this.stuNo = stuNo;
	}
}

public class SuperExam {

	public static void main(String[] args) {
		// super (부모생성자 호출)
		// 객체 생성의 원리
		// 자식 객체 생성시 부모객체가 먼저 생성 후 자식객체 생성
		// 모든 객체는 클래스의 생성자 호출을 원칙으로 한다
		// 만약 명시적으로 선언하지 않는다면 자식클래스에는 super()가 선언
		
		// super() 키워드는 '무조건' 첫줄에 삽입

	}

}
