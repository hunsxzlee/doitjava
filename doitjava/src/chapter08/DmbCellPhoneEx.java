package chapter08;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 100);
		
		//CellPhone���κ��� ��ӹ޴� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ޴� �޼ҵ�
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�");
		dmbCellPhone.sendVoice("�ٻڴ� ���߿� ��ȭ�ּ���");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();	
	}
}