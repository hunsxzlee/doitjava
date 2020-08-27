package example;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
			System.out.println("몇 줄을 출력할까요?(홀수만 입력): ");	
			line = sc.nextInt();
		} while (line % 2 ==0);
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i = 0; i < line; i++) {
			System.out.println(" ");
			for(int j = 0; j < upLine; j++) {
				if(j < upLine - i - 1) {
					System.out.print(" ");
				} else {
					if(j == upLine - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}	
				System.out.println();
			}
			
			for(int j = downLine - 1; j >= 0; j++) {
				for (int j = 0; j< downLine; j++) {
				if(j == downLine - i - 1) {
					System.out.println(" ");
				} else {
					if (j == downLine - i - 1) {
					System.out.println("*");
				} else {
					System.out.println(" ");
					}
				}
			}
		for (int j = 0; i < i; j++) {
			if (j == i - 1) {
				System.out.println("*");
			} else {
				System.out.println(" ");
			}
		}
		System.out.println();
	}
	}
}
}