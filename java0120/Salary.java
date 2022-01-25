package java0120;

public class Salary {
	//	①필드: String name(이름)
	//		  int salary (연봉)
	String name;
	int salary;
	
	//	②생성자 : Salary(String n, int s) 를 넘겨받아 name, salary에 대입	
	Salary(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	
	//③메서드 : getInfomation1()메서드에서 이름과 연봉을 출력
	public void getInformation1() {
		System.out.println("이름 : " + name + "\n연봉 : " + salary +"원");
	}

}
