package gamejava2;

import java.util.Random;
import java.util.Scanner;

public class GameJava {
	public static void main(String[] args) {
		int num[] = {0,1,2,3,4,5,6,7,8,9};			//내가 검색을 통해 알아본 답안
		Random random = new Random();
		for(int i=0; i<100; i++) {
			int r = random.nextInt(9);
		int temp=num[0];
		num[0]=num[r];
		num[r]=temp;
		}
		System.out.print("1~9까지의 숫자를 선택하시오: ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		for(int i=0; i<level; i++) {
			System.out.print(num[i]);
		}
		int count = 0;
		while(true) {
			int b=0, s=0, o=0;
		System.out.print("\n숫자 입력: ");
		count++;
		String user = sc.next();
		for(int i=0; i<level; i++) {
		if(num[i]==user.charAt(i)-48)
			s++;
		if(user.indexOf(num[i]+"")>=0)
			b++;
		if(user.indexOf(num[i]+"")<0)
			o++;
		}
		System.out.println("\n"+count+"번째 시도");
		System.out.println("스트라이크: "+s+" 볼:"+(b-s)+" 아웃: "+o);
		if(s>2)
			break;
		}
		System.out.println("\n정답입니다!!");
	}

}
