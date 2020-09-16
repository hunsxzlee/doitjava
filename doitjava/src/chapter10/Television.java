package chapter10;

public class Television {
	private int volume = 0;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	
	
}
