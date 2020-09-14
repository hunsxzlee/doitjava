package chapter08;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 1;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly(); //�θ�Ŭ������ fly() �޼ҵ� ����
		}
	}
}