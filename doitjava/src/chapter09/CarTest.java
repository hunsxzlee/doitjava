package chapter09;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AlCar();
		myCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}