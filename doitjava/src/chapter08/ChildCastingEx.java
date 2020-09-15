package chapter08;

public class ChildCastingEx {
	public static void main(String[] args) {
		ParentCasting parent = new ChildCasting();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";  	//출력 불가능한 예제
//		parent.method3();
		
		ChildCasting child = (ChildCasting)parent;
		child.field2 = "data2";		//출력 가능한 예제
		child.method3();
	}
}