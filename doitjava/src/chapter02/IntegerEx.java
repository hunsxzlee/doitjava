package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000;   //��ǻ�ʹ� �����(_)�� ���� ������ �ν��մϴ�.
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
//		bNum = 200;    //byte�ڷ����� -128~127���� ��� �����մϴ�.
		/*
		 * �ּ�ó�� ����Ű
		 * ��Ʈ�� + ����Ʈ + C  (���� ������ ����Ű(�ܿ�� ������))
		 * ��Ʈ�� + / (���� �������̰� ���� ����Ű)
		 * ��Ʈ�� + 7
		 */
		
//		sNum = 40_000;    //-32768 ~ 32767���� ��� �����մϴ�.
		
//		iNum = 2_200_000_000;  //-2,147,483,648 ~ 2,147,483,647���� ��� �����մϴ�.
		
		System.out.println(1_000_000_000);  //10�� ���
		System.out.println(3_000_000_000L);   //long�� �ڷ�� ������ L�� ���̴µ� �빮�ڸ� ����ؾ� �մϴ�.(�ҹ��� ���ٰ� ����� �ǳ� ���ڿ� ȥ���� ���ɼ��� ����)
		
		int result;
		result= sNum + bNum;
		
		long lNim = 3_000_000_000L;
		System.out.println(lNim);
		
	}

}
