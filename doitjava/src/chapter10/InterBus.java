package chapter10;

public class InterBus implements InterVehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}