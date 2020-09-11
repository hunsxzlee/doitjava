package chaoter05;

public class CakcStaticEx {
	public static void main(String[] args) {
		double result1 = 10 * 10 * CalcStatic,pi;
		int result2 = CalcStatic.plus(10, 5);
 		int result3 = CalcStatic.minus(10, 5);
		
		CakcStatic calcs = new CakcStatic();
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);
		System.out.println("calcs.pi:" + calcs.pi);
	}

}