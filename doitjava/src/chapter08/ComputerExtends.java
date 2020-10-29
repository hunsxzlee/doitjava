package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override  //상속받는 아래 문단에 오타가 잇는가 알려주는 단어
	double areaCircle(double r)	{
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
	}
}