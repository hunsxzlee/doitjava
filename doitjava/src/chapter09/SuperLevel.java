package chapter09;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("�ſ� ���� ���� �մϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("**** ����� ���� �Դϴ�.****");
	}
}