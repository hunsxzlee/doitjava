package example;

import java.util.Scanner;

public class Exam21 {
	public static void main(String[] args) {
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		
		int user, com;  //유저,컴
		int score = 0;	//시작 스코어는 0이라는 선언
		int life = 3;	//시작 라이프는 3이라는 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다.");
		while (true) {
		com = (int)(Math.random() * 3);
		System.out.println("0: 가위, 1: 바위, 2: 보");
		System.out.println("> ");
		user = sc.nextInt();	//0,1,2 이외의 입력을 재입력할수 있도록 합니다.
		
		System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
		System.out.println("유저 : " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
		if((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
			System.out.println("유저 승");
			score += 100;
		} else if(com == user) {
			System.out.println("비김");
			score += 10;
		} else {
			System.out.println("컴퓨터 승");
			life--;
		}
		System.out.println("현재 점수 :" + score);
		System.out.println("남은 라이프 :" + life);
		
		if(life == 0) {
			System.out.println("라이프가 0이라서 게임을 종료합니다");
			sc.close();
			break;
		}
		}
	}

}