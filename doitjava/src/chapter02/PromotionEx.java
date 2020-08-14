package chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;   //int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;   //int <- char
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 200;
		double doubleValue = intValue;   //double <- int
		System.out.println(doubleValue);
//		intValue = boudleValue;
		
		
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue;
				
		long longValue = 10000L;     //long로 저장할떈 이걸로만
		long res2 = intValue + longValue;

	}

}
