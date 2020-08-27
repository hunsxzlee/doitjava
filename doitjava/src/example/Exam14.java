package example;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력하겠습니까?: ");
		int line = sc.nextInt();
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
	}
	
			for(int i=downLine-1; i>=0; i--) {
				for(int j=0; j<=i; j++) {
					System.out.println("*");
				}
				System.out.println();
			}
			sc.close();
}
}