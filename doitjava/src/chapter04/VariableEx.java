package chapter04;

public class VariableEx {

	public static void main(String[] args) {
		System.out.println("�����н��Դϴ�.");
		System.out.println("���Ͻô� �޴��� ������ �ּ���.");
		int dduck = 3000;   //������ 3000��
		int sundae = 3000;  //���� 3000��
		int oden = 500;     //������ 500��
		int kimbab = 2000;  //��� 2000��
		
		int order1 = 0, order2 = 0, order3 = 0, order4 = 0; //������ ���� �� �ʱⰪ�� �־��ִ� ���� �����ϴ�.
		//������ �ʱⰪ�� ���ڴ�  0, �Ҹ��� false, ���ڿ��� "", char���� 0���� �ʱ�ȭ�մϴ�.
		order1=2;
		order2=1;
		order3=6;
		order4=1;
		
		int res1 = dduck * order1;
		int res2 = sundae * order2;
		int res3 = oden * order3;
		int res4 = kimbab * order4;
		
		System.out.println("�����̴� " + order1 + "�κ� �ֹ��Ͽ��� �ݾ���" + res1 + "���Դϴ�.");
		System.out.println("����� " + order2 + "�κ� �ֹ��Ͽ��� �ݾ���" + res2 + "���Դϴ�.");
		System.out.println("������ " + order3 + "�κ� �ֹ��Ͽ��� �ݾ���" + res3 + "���Դϴ�.");
		System.out.println("����� " + order4 + "�κ� �ֹ��Ͽ��� �ݾ���" + res4 + "���Դϴ�.");
		System.out.println("�� �޾��� " + (res1 + res2 + res3 + res4)+ "���Դϴ�.");
		System.out.print("���");   //print�� ���� ������ ���������� ����°� ����
		System.out.print("���\n");
		System.out.print("���");
		
	}

}
