package chapter08;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�Ű����� �ڵ� Ÿ�� ��ȯ
		driver.drive(bus);  	//Vehicle vehicle = bus;
		driver.drive(taxi);		//Vehicle vehicle = taxi;
		
	}
}