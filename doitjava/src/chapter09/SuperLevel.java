package chapter09;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("매우 높이 점프 합니다.");
	}
	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("**** 상급자 레벨 입니다.****");
	}
}