package example;

import java.util.Scanner;

public class Game03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 2; i <= n; i++) {
			cnt++;
			for(int j = 2; j < i/2; j++) {
				if(i % j == 0 ) {
					cnt--;
					break;
				}
			}
		}

		System.out.println("�Է��� ������ \"�Ҽ�\"�� ������ " + cnt + "���Դϴ�.");  //��������(\)�� �Բ� ���� �ε���ǥ�� ������ ��µȴ�.
		sc.close();
		
	}
}