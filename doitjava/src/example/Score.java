package example;

import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100 ~ 91 A등급
 * 90 ~ 81 B등급
 * 80 ~ 71 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
*/	
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, mat = 0;
		System.out.println("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력: ");
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
		System.out.println("당신의 평균 점수는 " + avg + "점이고 등급은 " + grade + "등급입니다.");
		
	}
}