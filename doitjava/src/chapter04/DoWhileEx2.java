package chapter04;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
				System.out.println("> ");
				inputString = scan.nextLine();
				System.out.println(inputString);
		} while (!inputString.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		scan.close();		//scan��ĵ�� ���� close Ŭ����� �ݵ�� �ݾ���� ��.
		
		}
	
}