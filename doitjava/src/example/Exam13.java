package example;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?");
		int line = sc.nextInt();
		for (int i = 0; i < 7; i++) {			//인트로 0로 초기화 후 7보다 작거나 같을때까지 출력
		  for (int j = 0; j < 7; j++) {
			 if(j%2 == 0) {
			   System.out.println("@");
			 } else {
			   System.out.println("#"); 		//역슬러시는 2개를 써야 컴퓨터가 입력됨
			 }
		  System.out.println();
	}	
		sc.close();
		
		}
		
	}

}
