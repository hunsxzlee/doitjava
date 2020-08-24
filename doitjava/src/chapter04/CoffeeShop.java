package chapter04;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		System.out.println("별다방입니다.");
		System.out.println("메뉴를 주문해 주세요.");
		Scanner sc = new Scanner(System.in);
		String menu = "";
		System.out.println("A: 아메리카노, M: 카페모카, C: 카라멜마끼아또, T: 오늘의 커피");
		System.out.println("> ");
		menu = sc.next();
		menu = menu.toUpperCase();  //문자를 대문자로 변경(투 어퍼 케이스)
		//toLowerCase() 문자를 소문자로 변경(투 로우 케이스)
		
		switch(menu) {
			case "A":
			case "a":
				System.out.println("아메리카노를 주문하셨습니다.");
				break;
			case "M":
			case "m":
				System.out.println("카페모카를 주문하셨습니다.");
				break;
			case "C":
			case "c":
				System.out.println("카라멜마끼아또를 주문하셨습니다.");
				break;
			case "T":
			case "t":
				System.out.println("오늘의 커피를 주문하셨습니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다. 다시 실행해 주세요.");
		}
		
		sc.close();
		
	}

}
