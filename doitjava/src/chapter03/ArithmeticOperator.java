package chapter03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int intResult;   //줄여서 iRes 밑에서도 동일
		double doubleResult;  //즐여서 dRes 밑에서도 동일
		
		intResult = 3+2;
		System.out.println(intResult);
		intResult = 3-2;
		System.out.println(intResult);
		intResult = 3*2;
		System.out.println(intResult);
		intResult = 3/2;
		System.out.println(intResult);
		doubleResult = 3.0/2.0;
		System.out.println(doubleResult);
		intResult = 3%2;
		System.out.println(intResult);
		
		doubleResult = (double)3/2;
		System.out.println(doubleResult);
		
	}

}
