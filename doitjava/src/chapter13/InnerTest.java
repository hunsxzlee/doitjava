package chapter13;
	
class Outlass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
	}
	
	void inTest() {
		System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
		System.out.println("OutClass sNum = " + sNum + ("�ܺ� Ŭ������ ���� ����"));
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}
	
public class InnerTest {	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
	}

}