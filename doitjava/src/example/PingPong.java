package example;

public class PingPong {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {				//&&�� �Է½� �ΰ� ���ÿ� �˻��ϰ� ��.
				System.out.println(i + "pingPong");
			} else if(i % 5 == 0) {                    //ù��°���� ������� ���� ���� �ι�°���� ���ΰͿ� ���� ��µ�
				System.out.println(i + "Pong");
			} else if(i % 3 == 0) {					
				System.out.println(i + "Ping");
			} else {
				System.out.println(i);	
			}		
		}
				
		for(int i=1; i<=100; i++) {		
			System.out.println(i + " ");
			if(i % 3 == 0) {
				System.out.println("Ping");
			}
			if(i % 5 == 0) {
				System.out.println("Pong");
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
