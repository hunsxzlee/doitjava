package example;

import java.util.Scanner;

public class Game02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thisMon = 4;											//��Ʈ�� �⺻���� ?�� ����
		System.out.println(thisMon + "���� ������ ���ڴ� �� ���ΰ���?");		//�ý��� ǥ������� ���� ������ �⺻���� ""�� �پ ����
		switch(thisMon) {											//����ġ����
			case 1:													//������ �ϼ��� ���� ���� ���� �극��ũ�� �μ��鼭 �밡�� �� �ʿ�X
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "���� 31�ϱ����Դϴ�.");
				break;
			case 2:
				System.out.println(thisMon + "���� 29�ϱ����Դϴ�.");		//������ �ϼ��� �ٸ� �޸� ���� �Է��� �극��ũ�� ĵ��
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