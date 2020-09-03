package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		int iNum;              //컨트롤 쉬프트 O 누르면 스케너 지정 가능
		Scanner sc = new Scanner(System.in);   //스캐너 생성 코드 - 변경 가능한 것은 변수명 뿐
//		
//		System.out.println("정수를 입력해 주세요.");
//		System.out.print("> ");
//		iNum = sc.nextInt();    //
//		System.out.println("입력한 정수: " + iNum);
//		System.out.println();
//		System.out.print("실수를 입력해 주세요.");
//		double dNum = sc.nextDouble();
//		System.out.println("입력한 실수 : " + dNum);
//		System.out.println();
//		System.out.print("실수(f)를 입력해 주세요.");
//		float fNum = sc.nextDouble();
//		System.out.println("입력한 실수(f) : " + fNum);
		System.out.println("문자열을 입력해 주세요: ");
//		String str = sc.next();   //문자열 입력에는 next() 사용하지만 공백은 넣을 수 없습니다.
//								  //스캐너에서 공백은 다음값 입력을 의미합니다.
//		System.out.println("입력한 문자열: " + str);
//		str = sc.next();
//		System.out.println("입력한 문자열: " + str);
//		str = sc.next();
//		System.out.println("입력한 문자열: " + str);
		
		String str = sc.nextLine();     //한 줄 입력 명령어로 공백도 입력 가능합니다.
		System.out.println("입력한 문자열: " + str);
		
		sc.close();  //스캐너는 더 이상 샤용하지 않는다면 닫아줘야 합니다.
	}

}
