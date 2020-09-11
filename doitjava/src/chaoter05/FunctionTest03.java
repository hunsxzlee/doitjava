package chaoter05;

public class FunctionTest03 {
	public static void main(String[] args) {
		Operator oper = new Operator(); //클래스의 이름과 동일한 메소드를 생성자라고 합니다.
		int num1 = 10;
		int num2 = 5;
		int res1 = oper.add(num1, num2);
		System.out.println(res1);
		int res2 = oper.sub(num1, num2);
		System.out.println(res2);

	}
}