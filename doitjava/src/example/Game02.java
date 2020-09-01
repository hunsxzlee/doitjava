package example;

public class Game02 {
	public static void main(String[] args) {
		
		int thisMon = 4;											//인트로 기본값을 8로 선언
		System.out.println(thisMon + "월의 마지막 일자는 몇 일인가요?");		//시스템 표기상으로 위의 선언한 기본값에 ""가 붙어서 나옴
		switch(thisMon) {											//스위치문은
			case 1:													//1월 3월 4월 7월 8월 10월 12월은 끝나는 일수가 같으므로 굳이 브레이크로 부수면서 노가다 할 필요X
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "월은 31일까지입니다.");
				break;
			case 2:
				System.out.println(thisMon + "월은 29일까지입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(thisMon + "월은 30일까지입니다.");
				break;
			default:
				System.out.println(thisMon + "월은 31일까지입니다.");
	}

}
}