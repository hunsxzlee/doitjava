package example;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");	
		int line = sc.nextInt();
		
		for(int i = line - 1; i >= 0; i--) {   //���������� �ܺ� ������ ���ҽ�����
			for(int j=0; j<=line; j++) {
				if(j < line -i) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();	
	}
		
	}

}
