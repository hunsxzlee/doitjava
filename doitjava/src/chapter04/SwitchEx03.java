package chapter04;

public class SwitchEx03 {

	public static void main(String[] args) {
		int thisMon = 8;
		System.out.println(thisMon + "월의 마지막 일자는 몇 일인가요?");
		switch(thisMon) {
			case 1:				//알트 누른 상태로 이동가능
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "월은 31일까지입니다.");
				break;
			case 2:
				System.out.println(thisMon + "월은 31일까지입니다.");
				break;
			default:
				System.out.println(thisMon + "월은 31일까지입니다.");
				
		}
	}
}
