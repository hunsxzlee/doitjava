package example;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");
		int line = sc.nextInt();
		for (int i = 0; i < 7; i++) {			//��Ʈ�� 0�� �ʱ�ȭ �� 7���� �۰ų� ���������� ���
		  for (int j = 0; j < 7; j++) {
			 if(j%2 == 0) {
			   System.out.println("@");
			 } else {
			   System.out.println("#"); 		//�������ô� 2���� ��� ��ǻ�Ͱ� �Էµ�
			 }
		  System.out.println();
	}	
		sc.close();
		
		}
		
	}

}
