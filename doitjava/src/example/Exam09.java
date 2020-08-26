package example;

public class Exam09 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i= 1; i<=50; i++) {
			sum += i;
		}
		double res = (double)sum /50;    //여기서 sum은 인트라 소수점은 버리게 됨, 그래서 더블을 넣어 강제로 변환해줘야 원하는 결과값이 나옴
		System.out.println(res);
	}

}
