package example;

public class Exam08 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println(i);   //여기까지 하면 정방향으로 숫자가 출력됨
		}
		
		System.out.println();
		
		for(int i=10; i>=1; i--) {   //역방향으로 숫자를 출력할시 서로 뒤집어 -로 만들면 된다.
			System.out.println(i);
		}
	}
}
