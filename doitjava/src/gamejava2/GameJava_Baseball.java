package gamejava2;

import java.util.Scanner;

public class GameJava_Baseball {
	public static void main(String[] args) {
		int[] com = makeCom();
		int[] user;									//선생님이 만드신 답안
		int cnt = 0;
		
		System.out.println("숫자 야구 게임");
	
	while(cnt++ <10) {
		System.out.println("카운트: " + cnt);
		user = inputUser(cnt);
		int[] result = compareArray(com, user);
		System.out.println("strike: " + result[0] + ", ball: " + result[1]);
		System.out.println();
		if(result[0] == 3) {
			System.out.println("정답입니다. 게임을 종료합니다.");
			break;
		}
	}
	System.out.println("정답은 [" + com[0] + "][" + com[1] + "][" + com[2] + "]입니다.");
	}	
	
	static int[] makeCom() {
		int[] com = new int[3];
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random() * 9) + 1;
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		return com;
	}

	static int[] inputUser(int cnt) {
		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		for(int i=0; i<user.length; i++) {
			System.out.print(i + 1 + "번째 숫자: ");
			user[i] = sc.nextInt();
			if(user[i] / 10 > 0 || user[i] == 0) {
				System.out.println("1~9까지만 입력 가능합니다. 다시 입력해 주세요.");
				i--;
				continue;
			}
			for(int j=0; j<i; j++) {
				if(user[i] == user[j]) {
					System.out.println("같은 값을 입력하셨습니다. 다시 입력해 주세요.");
					i--;
					break;
				}
			}
		}
		if(cnt == 10) sc.close();
		return user;
	}
	
	static int[] compareArray(int[] com, int[] user) {
		int[] result = new int[2];
		for(int i=0; i<com.length; i++) {
		for(int j=0; j<user.length; j++) {
			if(com[i] == user[j]) {
				result[1]++;
			}
		}
	}
	for(int i=0; i<com.length; i++) {
		if(com[i] == user[i]) {
			result[0]++;
			result[1]--;
		}
	}
	return result;
	}	
}