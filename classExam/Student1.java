package classExam;
//클래스 생성


class Test{
	// 객체의 속성(맴버변수)
	public String stuName;
	public int stuID;
	// 객체의 기능(메소드)
	// 1. 학생의 정보를 보는 메소드
	public void showStudentInfo() {
		//변수명(함수명) 사용시의 표기법
		// 1. PascalCase(파스칼 표기법)
		//		-단어 사이사이 마다 대문자로 표기함으로써 단어를 구분
		// 2. camelCase(카멜 표기법)
		//		-첫글자 제외 단어 사이사이 마다 대문자로 표기함으로써 단어를 구분
		//			대문자마다 튀어나오는게 낙타 등 같다고 붙여짐
		// 3. snake_case(스네이크 표기법(언더바/언더스코어 표기법))
		//		-단어 사이사이 마다 _로 표기함으로써 단어를 구분
		
		System.out.println(stuName+stuID);
		
	}
	
}

public class Student1 {
	
	public static void main(String[]args) {
		// 위에서 생성해둔 test 클래스의 객체를 생성
		// 인스턴스 : 클래스를 통해 생성된 개체
		Test stuLee = new Test();
		// 인스턴스 stuLee의 맴버변수 stu에 "이지은"속성 부여
		stuLee.stuName = "이지은";
		stuLee.stuID = 001;
		
		//stuLee인스턴스의 showStudentInfo 메서드 호출
		stuLee.showStudentInfo();
		
		//
		Test stu002 = new Test();
		stu002.stuName = "오영수";
		stu002.stuID = 100;
		
		stu002.showStudentInfo();
		
		System.out.println(stuLee);
		System.out.println(stu002);
		
		
	}

}
