package chapter09;

public class AlCar extends Car {
	@Override
	public void drive() {
		System.out.println("���� �����մϴ�");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�");
	}
}