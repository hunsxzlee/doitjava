package example;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");
		int line = sc.nextInt();
		for (int i = 0; i < 7; i++) {			//��Ʈ�� 0�� �ʱ�ȭ �� 7���� �۰ų� ���������� ���
		  for (int j = 0; j < i; j++) {
			   System.out.println("$");
			}
		  System.out.println();
		}	
		sc.close();
	}
}