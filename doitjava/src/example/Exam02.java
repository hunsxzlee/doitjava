package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���:");
		int num = sc.nextInt();
		if(num % 2 == 0) {   //���࿡ num�� ���ڰ� 2�� ������ 0�� �ȴٸ�
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�."); //����
		} else {    //���࿡ num�� ���ڰ� 2�� ������ 0�� ���� �ʴ´ٸ�
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");  //����
		}
		sc.close();   //����� Ŭ�󽺴� �ݵ�� �ݾ���ߵȴ�.
		
	}

}