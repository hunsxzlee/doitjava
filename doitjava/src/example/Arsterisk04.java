package example;

public class Arsterisk04 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {  //�̴�
			for(int j = 0; j < 5; j++) {  //����
				if(4 - i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
			}
			for(int j = 0; j < i; j++) {  //����
				System.out.println("*");
			}
			System.out.println();
		}
		for(int i = 3; i >= 0; i--) {   //�ϴ�
			for(int j = 0; j < 5; j++) {	//����
				if(4 - i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			}
		}
	}
}