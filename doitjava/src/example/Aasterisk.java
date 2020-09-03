package example;

public class Aasterisk {

	public static void main(String[] args) {
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				if(i == j) {
				System.out.print(i + 1);
				} else {
				System.out.print(" ");
				}
				System.out.println();
				
			}
		}
	}
}