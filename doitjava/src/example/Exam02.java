package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num = sc.nextInt();
		if(num % 2 == 0) {   //만약에 num의 숫자가 2를 나눠서 0이 된다면
			System.out.println("입력한 숫자는 짝수입니다."); //진실
		} else {    //만약에 num의 숫자가 2를 나눠서 0이 되지 않는다면
			System.out.println("입력한 숫자는 홀수입니다.");  //거짓
		}
		sc.close();   //사용한 클라스는 반드시 닫아줘야된다.
		
	}

}