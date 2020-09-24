package gamejava2;

import java.util.Scanner;

public class GameJava_Baseball {
	public static void main(String[] args) {
		int[] com = makeCom();
		int[] user;									//�������� ����� ���
		int cnt = 0;
		
		System.out.println("���� �߱� ����");
	
	while(cnt++ <10) {
		System.out.println("ī��Ʈ: " + cnt);
		user = inputUser(cnt);
		int[] result = compareArray(com, user);
		System.out.println("strike: " + result[0] + ", ball: " + result[1]);
		System.out.println();
		if(result[0] == 3) {
			System.out.println("�����Դϴ�. ������ �����մϴ�.");
			break;
		}
	}
	System.out.println("������ [" + com[0] + "][" + com[1] + "][" + com[2] + "]�Դϴ�.");
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
			System.out.print(i + 1 + "��° ����: ");
			user[i] = sc.nextInt();
			if(user[i] / 10 > 0 || user[i] == 0) {
				System.out.println("1~9������ �Է� �����մϴ�. �ٽ� �Է��� �ּ���.");
				i--;
				continue;
			}
			for(int j=0; j<i; j++) {
				if(user[i] == user[j]) {
					System.out.println("���� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
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