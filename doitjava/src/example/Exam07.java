package example;

public class Exam07 {

	public static void main(String[] args) {
		int cnt = 0;    //수를 살릴땐 카운트라는 걸로 초기화
		
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				cnt++;     //위 조건을 만족할 경우 1 더해여 결과로 나타내라
			}
		}
		System.out.println(cnt);
		
		
	}

}
