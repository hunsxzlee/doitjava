package example;

public class Game02 {
	public static void main(String[] args) {
		
		int thisMon = 4;											//��Ʈ�� �⺻���� 8�� ����
		System.out.println(thisMon + "���� ������ ���ڴ� �� ���ΰ���?");		//�ý��� ǥ������� ���� ������ �⺻���� ""�� �پ ����
		switch(thisMon) {											//����ġ����
			case 1:													//1�� 3�� 4�� 7�� 8�� 10�� 12���� ������ �ϼ��� �����Ƿ� ���� �극��ũ�� �μ��鼭 �밡�� �� �ʿ�X
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "���� 31�ϱ����Դϴ�.");
				break;
			case 2:
				System.out.println(thisMon + "���� 29�ϱ����Դϴ�.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(thisMon + "���� 30�ϱ����Դϴ�.");
				break;
			default:
				System.out.println(thisMon + "���� 31�ϱ����Դϴ�.");
	}

}
}