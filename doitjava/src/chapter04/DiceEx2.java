package chapter04;

public class DiceEx2 {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;                //����(������ ��)�� �߻� ��Ų��.
		System.out.println(dice);
		switch(dice) {
				case 1:
					System.out.println("�ֻ����� ������ 1�Դϴ�.");
					break;
				case 2:
					System.out.println("�ֻ����� ������ 2�Դϴ�.");
					break;
				case 3:
					System.out.println("�ֻ����� ������ 3�Դϴ�.");
					break;
				case 4:
					System.out.println("�ֻ����� ������ 4�Դϴ�.");
					break;
				case 5:
					System.out.println("�ֻ����� ������ 5�Դϴ�.");
					break;
				default:
					System.out.println("�ֻ����� ������ 6�Դϴ�.");
		
		}
	}
}


/*
 * Math.random()�� ������ 0���� ũ�ų� ���� 1���� ���� ��
 * 0 <= Marh.random() <1  0�� ���ų� ũ��, 1���� �������� ���´�.
 * 0 * 6 + 1<= Marh.random() * 6 + 1 < 1 * 6 + 1  6�� 1�� ���ϸ� ����, 0�� ���ų� ũ��, 7���� �������� ���´�.
 */