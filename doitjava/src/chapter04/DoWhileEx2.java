package chapter04;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그렘을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
				System.out.println("> ");
				inputString = scan.nextLine();
				System.out.println(inputString);
		} while (!inputString.equals("q"));
		System.out.println();
		System.out.println("프로그렘 종료");
		scan.close();		//scan스캔은 사용시 close 클로즈로 반드시 닫아줘야 함.
		
		}
	
}