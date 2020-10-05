package chapter14;

public class ThrowsException {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		System.out.println("프로그렘을 종료합니다.");
		throw new ClassNotFoundException();
		
	}

}
