package chaoter05;

public class CakcStatic {
		static double pi = 3.14159;  //정적 멤버
		int num1 = 10;		//인스턴스 멤버
		int num2 = 20;		//인스턴스 멤버
		
		static int plus(int x, int y) {
			return x + y;
		}
		
		static int minus(int x, int y) {
			return x - y;
		}
		
		int multiply(int x, int y) {
			return x * y;
		}
}