package chapter04;

public class ContinueEx {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("hello!" + i);
			if(i==1) {
				continue;  //컨티뉴가 되면 다시 위로 올라가게 됨
			}
			System.out.println("출력..");
		}
		
		int cnt = 0;
		while(true) {
			System.out.println("While" + cnt++);
			if(cnt == 5) {
				continue;
			}
			System.out.println("출력..");
			if(cnt == 10) {
				break;
			}
		}	
	}
}
