package chapter08;

public class InstanceofEx {
	public static void method1(Parentlnst parent) {
		if(parent instanceof Childlnst) {  //��ȯ����Ȯ��
			Childlnst child = (Childlnst) parent;
			System.out.println("method1-Child�� ��ȯ");
		} else {
			System.out.println("method1-Child�� ����");
		}
	}
	public static void method2(Parentlnst parent) {
		Childlnst child = (Childlnst) parent; //���ܹ߻�����
		System.out.println("method2-Child�� ��ȯ");
	}
	public static void main (String[] args) {
		Parentlnst parentA = new Childlnst();
		method1(parentA);
		method2(parentA);
		Parentlnst parentB = new Parentlnst();
		method1(parentB);
		method2(parentB); //���ܹ߻�
		
	}
}