package chapter08;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 100);
		
		//CellPhone으로부터 상속받는 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받는 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다");
		dmbCellPhone.sendVoice("바쁘니 나중에 전화주세요");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();	
	}
}