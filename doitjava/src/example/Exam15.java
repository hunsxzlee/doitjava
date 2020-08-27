package example;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");			//오른쪽으로 붙은 삼각형 출력법
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