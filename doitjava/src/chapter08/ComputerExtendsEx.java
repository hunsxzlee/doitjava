package chapter08;

public class ComputerExtendsEx {
	public static void main(String[] args) {
		int r = 10;
		
		CalculatorExtends calc = new CalculatorExtends();
		System.out.println("원면적: " + calc.areaCircle(r));
		System.out.println();
		
		
		CalculatorExtends com = new ComputerExtends();
		System.out.println("원면적: " + com.areaCircle(r));
		
	}
}