package example;

public class PingPong {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {				//&&�� �Է½� �ΰ� ���ÿ� �˻��ϰ� ��.
				System.out.print(i + "pingPong");
			} else if(i % 5 == 0) {                    //ù��°���� ������� ���� ���� �ι�°���� ���ΰͿ� ���� ��µ�
				System.out.print(i + "Pong");
			} else if(i % 3 == 0) {					
				System.out.print(i + "Ping");
			} else {
				System.out.println(i);	
			}		
		}
				
		for(int i=1; i<=100; i++) {		
			System.out.print(i + " ");
			if(i % 3 == 0) {
				System.out.print("Ping");
			}
			if(i % 5 == 0) {
				System.out.print("Pong");
			}
			System.out.println();
			
//			if(i % 5 == 0) {
//			System.out.println(i + "Pong");
//		} else {     ���� ���� ���� ���� ������ ���� ���ڴ� 2���� ������ ������ �־���.
//			System.out.println(i);
//		}
		
		}
	}
}
