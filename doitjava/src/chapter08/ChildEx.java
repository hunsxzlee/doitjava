package chapter08;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		Parent.method1();
		Parent.method2();
		//Parent.method3() 호출 불가능
	}
}