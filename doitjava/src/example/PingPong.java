package example;

public class PingPong {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {				//&&를 입력시 두개 동시에 검색하게 됨.
				System.out.println(i + "pingPong");
			} else if(i % 5 == 0) {                    //첫번째에서 통과되지 못한 것중 두번째에서 참인것에 퐁이 출력됨
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
//		} else {     내가 적은 답은 퐁이 적히지 않은 문자는 2개씩 나오는 문제가 있었다.
//			System.out.println(i);
//		}
		
		}
	}
}
