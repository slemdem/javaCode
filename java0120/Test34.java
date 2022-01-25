package java0120;

public class Test34  extends Salary{
	
	//①필드 : String department (부서)
	String department;
	
	//②생성자 : name, salary,department를 넘겨받아 각각 필드에 대입
	//  		필요하면 부모 생성자 호출할수도 있다
	Test34(String name, int salary, String department) {
		super(name, salary);
		this.department=department;
	}
	
	//③메서드 : getInfomation2()메서드에서 부서출력
	public void getInformation2() {
		System.out.println("이름 : " + name + "\n연봉 : " + salary + "\n부서 : "+department);
	}
}
