package example;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");			//���������� ���� �ﰢ�� ��¹�
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			for(int j=0; j<=line; j++) {
				if(j < line -i) {
					System.out.println(" ");
				} else {
					System.out.println("$");
				}
			
			
			
			}
			System.out.println();	
	}

}
}