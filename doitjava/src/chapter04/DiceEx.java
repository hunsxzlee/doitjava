package chapter04;

public class DiceEx {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;                //난수(랜덤한 수)를 발생 시킨다.
		System.out.println(dice);
		if(dice <= 3) {
			if(dice == 1) {
				System.out.println("주사위의 눈금은 1입니다.");
			} else if(dice == 2) {
				System.out.println("주사위의 눈금은 2입니다.");
			} else {
				System.out.println("주사위의 눈금은 3입니다.");
			}
		} else {
			if(dice == 4) {
				System.out.println("주사위의 눈금은 4입니다.");
			} else if(dice == 5) {
				System.out.println("주사위의 눈금은 5입니다.");
			} else {
				System.out.println("주사위의 눈금은 6입니다.");
			}
		}
	}
}


/*
 * Math.random()의 범위는 0보다 크거나 같고 1보다 작은 수
 * 0 <= Marh.random() <1  0과 같거나 크고, 1보다 작은수가 나온다.
 * 0 * 6 + 1<= Marh.random() * 6 + 1 < 1 * 6 + 1  6에 1을 더하며 곱해, 0과 같거나 크고, 7보다 작은수가 나온다.
 */