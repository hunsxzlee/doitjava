package example;

import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random() * 100) + 1;
		int user = 0;
		int cnt = 0;
		
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1~100 중에 랜덤하게 생성괸 숫자를 맞춰 주세요.");
		
		while(true) {
			System.out.println("> ");
			user = sc.nextInt(); 
			System.out.println(++cnt + "회 입력하셨습니다.");
			if (user > com) {
				System.out.println("입력하신 숫자보다 아래에 있습니다.(Down!)");
			} else if (user < com) {
				System.out.println("입력하신 숫자버다 위에 있습니다.(Up!)");
			} else {
				System.out.println("정답입니다. 게임을 종료합니다.");
				sc.close();
				break;
		}
}
}
}