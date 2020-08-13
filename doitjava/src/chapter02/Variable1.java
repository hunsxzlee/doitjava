package chapter02;

public class Variable1 {

	public static void main(String[] args) {
		int level = 10;   //level 변수를 선언하고 정수를 10을 저장하였습니다.
		int hp;
		System.out.println("현재 레벨은 얼마인가요?");  //문자열은 ""로 감싸고 화면에 그대로 출력됩니다.
		System.out.println(level);  //변수명을 입력하면 변수에 저장된 값이 출력됩니다.
		System.out.println("현재 체력 게이지는 얼마인가요?");
		hp = 500;
		System.out.println(hp);
		System.out.println("적으로 부터 100의 데미지를 입었습니다.");
		hp = 400;
		System.out.println("현재 체력 게이지는 얼마인가요?");
		System.out.println(hp);
		
		
	}

}
