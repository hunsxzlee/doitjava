package chapter04;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		for(dan = 2; dan <=9; dan++) {  //dan 대신 i를 사용할수도 있다. 이 경우 다음에 오는 영어가 j라서 다음 선언은 j로 한다.
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + dan * times);
			}
			System.out.println();

		}
	}

}