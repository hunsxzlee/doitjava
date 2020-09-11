package chaoter05;

public class Operator {
	int add(int a, int b) {
		return a + b;  //매개 변수의 이름은 맘대로 생성가능
	}
	
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int n, int m) {
		if(m == 0) {
			System.out.println("0으로 나눌 수는 없습니다.");
			return 0;
		}
		return n / m;
	}	
	
	void printSrar() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public char[] add(double d) {
		// TODO Auto-generated method stub
		return null;
	}
}