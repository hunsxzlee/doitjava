package chapter14;

public class ThrowsException {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		System.out.println("���α׷��� �����մϴ�.");
		throw new ClassNotFoundException();
		
	}

}
