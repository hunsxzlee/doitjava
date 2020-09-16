package chapter10;

public class RemoteConEx {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new RemoteControl() {
			
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = volume;
				} else if(volume < RemoteControl.MAX_VOLUME)
					this.volume = volume;
				} else {
					this.volume = volume;
				}
				System.out.println("������ ���� ���� " + this.volume + "�Դϴ�.");
			}
		};
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}