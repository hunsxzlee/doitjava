package chapter04;

public class BreakEx {

	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;   //switch문을 파괴하는 break입니다.
		default: 
			System.out.println("num은 1과 2가 아닌 다른 수입니다.");
		}
		
		while(true) {   //조건은 true이면 무한반복문 입니다.
			System.out.println("반복중.." + num);
			num++;
			if(num > 10) {
				break;   //while 와일문을 파괴하는 break입니다.
			}	
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("*");
			break;
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("@");
			}
		}
	}
}