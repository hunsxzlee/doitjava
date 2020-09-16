package chapter10;

public class InterDriverEx {

	public static void main(String[] args) {
		InterDriver driver = new InterDriver();
		
		InterBus bus = new InterBus();
		InterTaxi taxi = new InterTaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}