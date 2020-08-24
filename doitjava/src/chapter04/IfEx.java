package chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 80;
		
		if (score >= 90){
					System.out.println("점수가 90보다 크거나 같습니다.");  //중괄호가 잇을경우 if전체에 영향을 받고
					System.out.println("등급은 A입니다.");		     //중괄호가 없을경우 한줄만 if에 영향을 받음
		} else {  //else 구문은 if문에서 false일 경우 실행되는 영역
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}	
			
//		if (score < 90){
//					System.out.println("점수가 90보다 작습니다.");
//					System.out.println("등급은 B입니다.");
		}	

}

