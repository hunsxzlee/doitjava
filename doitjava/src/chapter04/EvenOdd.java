package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������
 * ����ϼ���.
 */
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���:");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		sc.close();
		
	
		
//		int thisMon = 8;
//		System.out.println(thisMon + "�� ���ڴ� ¦�� �ΰ���?");
//		switch(thisMon) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//				System.out.println(thisMon + "�� ���ڴ� ¦���� �ƴմϴ�.");
//				break;
//			
//			case 2:
//			case 4:
//			case 8:
//			case 10:
//				System.out.println(thisMon + "�� ���ڴ� ¦���� �½��ϴ�.");
//				break;
//			default:
//				System.out.println(thisMon + "�� ���ڴ� ¦���� �½��ϴ�.");
//		���� ���� �����

	}
}

