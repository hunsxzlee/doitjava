package example;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
//		for(int i=9; i>=0; i--) {			//�����°� �ݴ밡 �Ǿ�� �Ѵ�.
//			System.out.println(i);
		
			Scanner sc = new Scanner(System.in);
			System.out.println("�� ���� ����ұ��?");
			int line = sc.nextInt();
			for (int i = line-1; i < 7; i--) {			//��Ʈ�� 0�� �ʱ�ȭ �� 7���� �۰ų� ���������� ���
			  for (int j = 0; j < i; j++) {
				   System.out.println("$");
				}
			  System.out.println();
			}	
			sc.close();
		
		}
	}
