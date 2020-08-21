package chapter04;

public class SwitchEx2 {

	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("현재 시간은" + now + "시입니다.");
		System.out.println("남은 일정은 다음과 같습니다.");
		
		switch(now) {
			case 9:
				System.out.println("9시에는 출근을 합니다.");
				break;    //브레이크가 없다면 다음에 잇을 케이스를 실행시킨다.
			case 10:
				System.out.println("10시에는 아침 조회를 합니다.");
				break;
			case 11:
				System.out.println("11시에는 오전업무를 시작합니다.");
				break;
			case 12:
				System.out.println("12시에는 점심을 먹습니다.");
				break;
		}
		
		String pos = "대리";
		switch(pos) {
			case "부장":
				System.out.println("부장의 월급은 400만원입니다.");
				break;
			case "괴장":
				System.out.println("과장의 월급은 300만원입니다.");
				break;
			case "대리":
				System.out.println("대리의 월급은 200만원입니다.");
			default:
				System.out.println("일반 사원의 월급은 150만원입니다.");  //마지막은 브레이크를 걸든 안걸든 동일한 효과이기에 여기선 걸지 않았다.
		}
	}
}
