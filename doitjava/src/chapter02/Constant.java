package chapter02;

public class Constant {

	private static final Object MIN_NUM = null;

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIX_NUM;
		MIN_NUM = 200;    //���� �� �ݵ�� �ʱⰪ�� �Է��ؾ� �Ѵ�.
//		MAX_NUM = 1000;  //final�� ���������� ����Ǳ� ������ ���� ������ �Ұ����ϴ�.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
