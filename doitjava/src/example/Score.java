package example;

import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100 ~ 91 A���
 * 90 ~ 81 B���
 * 80 ~ 71 C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
*/	
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, mat = 0;
		System.out.println("���� ���� �Է�: ");
		kor = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		eng = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		mat = sc.nextInt();
		char grade = 0;
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
//		if(avg >= 91) {
//			grade = 'A';
//		} else if (avg < 91 && avg >= 81) {
//			grade = 'B';
//		} else if (avg < 81 && avg >= 71) {
//			grade = 'C';
//		} else {
//			grade = 'F';
//		}
		switch((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;	
		case 7:
			grade = 'C';
			break;	
		default:
			grade = 'F';
			
		}
		System.out.println("����� ��� ������ " + avg + "���̰� ����� " + grade + "����Դϴ�.");
		
	}
}