package java0119;

public class ExceptionTest {
	String name;
	
	public void setName (String name) {
		if(name == null) {
			throw new CustomExeption();
		}
	}

}
