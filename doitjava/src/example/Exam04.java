package example;

public class Exam04 {

	public static void main(String[] args) {
		
		int num = 2;   //내가 적은 답
		num += 4;
		num += 6;
		num += 8;
		num += 10;
		
		System.out.println("1부터 10까지의 수 중 짝수만의 합은 " + num + "입니다.");
		
		int sum =0;
		for(int i=1; i<=10; i++) {  //모범답안
			if(i % 2 == 0) {		//만약  숫자i가 10보다 작고 2로 나눳을때 0이되는 값이면 더하라
				sum += i;			
			}
		}
		System.out.println(sum);
		
	}

}
