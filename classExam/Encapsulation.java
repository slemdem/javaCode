package classExam;


class Test1{
	String name;
	Test1(String name){
		this.setName(name);
	}
	
	private void mTest() {
		System.out.println("privateTest");
	}
	
	// 겟터
	public String getName() {
		return name;
	}
	// 셋터
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// 캡슐화
		// 캡슐안에 들어가 내용물을 보호하고 숨기기 위해 처리하는 방법
		
		// 캡슐화의 목적
		// 정보은닉 -> 내부에서 사용하는 클래스를 노출하지 않거나
		//			클래스 내부에서만 사용하는 메서드가 외부에 노출되지 않도록
		//			숨기고 변수에 정장된 값이 외부에서 변하지 않도로 보호하기 위함
		Test1 t = new Test1("test");
		System.out.println(t.name); // 접근제어자가 private인 경우 접근 불가
//		System.out.println(t.getName());
		
	}

}
