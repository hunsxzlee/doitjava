package example;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");
		int line = sc.nextInt();
		for (int i = 0; i < 7; i++) {			//인트로 0로 초기화 후 7보다 작거나 같을때까지 출력
		  for (int j = 0; j < i; j++) {
			   System.out.println("$");
			}
		  System.out.println();
		}	
		sc.close();
	}
}