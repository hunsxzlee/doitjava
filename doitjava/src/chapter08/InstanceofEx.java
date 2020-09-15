package chapter08;

public class InstanceofEx {
	public static void method1(Parentlnst parent) {
		if(parent instanceof Childlnst) {  //변환가능확인
			Childlnst child = (Childlnst) parent;
			System.out.println("method1-Child로 변환");
		} else {
			System.out.println("method1-Child로 실패");
		}
	}
	public static void method2(Parentlnst parent) {
		Childlnst child = (Childlnst) parent; //예외발생가능
		System.out.println("method2-Child로 변환");
	}
	public static void main (String[] args) {
		Parentlnst parentA = new Childlnst();
		method1(parentA);
		method2(parentA);
		Parentlnst parentB = new Parentlnst();
		method1(parentB);
		method2(parentB); //예외발생
		
	}
}