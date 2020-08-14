package chapter02;

public class CastingEx {

	public static void main(String[] args) {
		int iVal = 44032;
		char cVal = (char) iVal;
		System.out.println(cVal);
		
		long lVal = 500;
		iVal = (int) lVal;
		System.out.println(iVal);
		
		double dVal = 3.14;
		iVal = (int) dVal;
		System.out.println(iVal);
		
		int iNum = 103029770;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
	}

}
