package classExam;

class ParentsClass{
	int field1;
	
	void pMethod() {
		System.out.println("부모 메소드 호출!");
	}
}
// ChildClass는 ParentsClass를 상속받는다,
// 상속을 받는 순간 자식클래스는 부모클래스의 모든 필드와 메서드를 사용할 수 있다
class ChildClass1 extends ParentsClass{
	
}
//ChildClass1과 ChildClass2는 얼핏 보기에 형제관계로 보일 수 있지만 
//클래스에서 형제관계는 없다
// 하지만 두 클래스는 부모가 같기 때문에
// 부모클래스에 기능을 추가하거나 변경하게 된다면
// 두 클래스는 공통으로 해당 기능을 소유하게 된다
class ChildClass2 extends ParentsClass{
	
}
// Gchild 클래스는 parents 클래스의 자손 클래스
// -> Gchild 클래스는 ParentsClass와 간접상속 관계
class Gchild extends ChildClass2 {
	
}

class another{
	// 하나의 거대한 클래스를 작성하는 것보다 단위별로 여러개의 클래스를 작성한 후
	// 이 단위 클래스들을 포함 관계를 새사용 하면 손쉽게 클래스를 작성할 수 있음
	Gchild g = new Gchild();
}

public class Inheritance {

	public static void main(String[] args) {
		// 상속 : 기존클래스를 재사용하여 새로운 클래스를 작성하는 것
		//		- 상위클래스(부모)의 내용을 하위클래스(자식)로 물려주는 것
		
		
		// 상속의 장점
		// 1. 코드의 중복을 줄여준다
		// 	 - 이미 작성되어 있는 크래스의 메소드, 필드를 호출하면 되기 때문
		// 2. 코드의 재사용성을 극대화
		//	 - 코드의 공통적으로 관리해서 그냥 호출만 해주면 된다
		// 3. 코드의 추가와 변경이 쉬움
		
		// 상속시 주의사항
		// 자바에서는 다중 상속은 지원하지 않음
		// extends 키워드 뒤에는 단 하나의 부모 클래스만 와야 한다(파이썬은 지원함)
		// 자식클래스에서 선언한 필드와 메소드는 부모클래스에서 사용 불가
		
		// 상속은 클래스의 재사용
		// 상속말고 클래스를 재사용하는 방법은 더 있음
		
		// 포함관계
		// 다른 클래스를 맴버변수로 정의해 포함 ->인스턴스 정의
		// 하나의 거대한 클래스를 작성하는 것보다 단위별로 여러개의 클래스를 작성한 후
		// 이 단위 클래스들을 포함 관계를 새사용 하면 손쉽게 클래스를 작성할 수 있음

		// 상속관계 vs 포함관계
		// 클래스 작성시 혼란스럽다면
		// ~는 ~이다 vs ~은 ~을 가지고 있다
		
		// 부모 생성자 호출
		
		
		ChildClass1 cc = new ChildClass1();
		cc.pMethod();
		cc.field1+=10;
		System.out.println(cc.field1);

	}

}
