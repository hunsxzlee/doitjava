package chapter13;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
	@Override
	public void run() {
		System.out.println("i =" + i);
		System.out.println("num = " + num);
		System.out.println("locaNum = " + localNum);
		System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
		System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
			}
		}
		return new MyRunnable();
	}	
}

public class LocallnnerTest {
	public static void main(String[] args) {
		Outer our = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}