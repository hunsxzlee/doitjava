package chapter04;

public class BreakEx {

	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num�� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("num�� 2�Դϴ�.");
			break;   //switch���� �ı��ϴ� break�Դϴ�.
		default: 
			System.out.println("num�� 1�� 2�� �ƴ� �ٸ� ���Դϴ�.");
		}
		
		while(true) {   //������ true�̸� ���ѹݺ��� �Դϴ�.
			System.out.println("�ݺ���.." + num);
			num++;
			if(num > 10) {
				break;   //while ���Ϲ��� �ı��ϴ� break�Դϴ�.
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