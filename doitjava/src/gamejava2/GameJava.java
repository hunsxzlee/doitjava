package gamejava2;

import java.util.Random;
import java.util.Scanner;

public class GameJava {
	public static void main(String[] args) {
		int num[] = {0,1,2,3,4,5,6,7,8,9};			//���� �˻��� ���� �˾ƺ� ���
		Random random = new Random();
		for(int i=0; i<100; i++) {
			int r = random.nextInt(9);
		int temp=num[0];
		num[0]=num[r];
		num[r]=temp;
		}
		System.out.print("1~9������ ���ڸ� �����Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		for(int i=0; i<level; i++) {
			System.out.print(num[i]);
		}
		int count = 0;
		while(true) {
			int b=0, s=0, o=0;
		System.out.print("\n���� �Է�: ");
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
		System.out.println("\n"+count+"��° �õ�");
		System.out.println("��Ʈ����ũ: "+s+" ��:"+(b-s)+" �ƿ�: "+o);
		if(s>2)
			break;
		}
		System.out.println("\n�����Դϴ�!!");
	}

}
