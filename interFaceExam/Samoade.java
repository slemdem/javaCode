package interFaceExam;

//implements는 다중상속을 대체 할 수 있음
public class Samoade implements Doggy2 {
	
	private static String name;
	
	public Samoade(String name) {
		//인터페이스는 super 키워드가 필수가 아니다
		this.setName(name);
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("뛰어노는 중");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzzZZZZZZZZ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("챱챱");
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Samoade.name = name;
	}

}
