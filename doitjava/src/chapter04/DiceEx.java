package chapter04;

public class DiceEx {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;                //����(������ ��)�� �߻� ��Ų��.
		System.out.println(dice);
		if(dice <= 3) {
			if(dice == 1) {
				System.out.println("�ֻ����� ������ 1�Դϴ�.");
			} else if(dice == 2) {
				System.out.println("�ֻ����� ������ 2�Դϴ�.");
			} else {
				System.out.println("�ֻ����� ������ 3�Դϴ�.");
			}
		} else {
			if(dice == 4) {
				System.out.println("�ֻ����� ������ 4�Դϴ�.");
			} else if(dice == 5) {
				System.out.println("�ֻ����� ������ 5�Դϴ�.");
			} else {
				System.out.println("�ֻ����� ������ 6�Դϴ�.");
			}
		}
	}
}


/*
 * Math.random()�� ������ 0���� ũ�ų� ���� 1���� ���� ��
 * 0 <= Marh.random() <1  0�� ���ų� ũ��, 1���� �������� ���´�.
 * 0 * 6 + 1<= Marh.random() * 6 + 1 < 1 * 6 + 1  6�� 1�� ���ϸ� ����, 0�� ���ų� ũ��, 7���� �������� ���´�.
 */