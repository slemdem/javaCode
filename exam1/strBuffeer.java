package exam1;

public class strBuffeer {

	public static void main(String[] args) {
		// stringbuffer : 문자열을 추가하거나 변경할 때 사용하는 자료형
		// 문자 추가시 객체를 따로 생성할 필요가 없기 때문에 메로리 사용에서 이득을 많이 가져갈 수 있음
		
		// stringBuffer의 모순점
		// 자료형 크기 자체가 무거운 편 (string의 2배)
		// string과 strinBuffer는 전략적으로 선언이 필요
		// stringBuffer : 변경작업이 많을 때 
		// string : 변경작업이 거의 없을 때 
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("2022");
		sb.append(" ");
		sb.append("java");
		sb.insert(5, "everybody");
		String result = sb.toString();
		System.out.println(result);
		
		String greeting = "hello";
		String teamName = "java web devTeam";
		int year = 2022 ;
		System.out.println(String.format("%s %d %s",greeting, year, teamName));

	}

}
