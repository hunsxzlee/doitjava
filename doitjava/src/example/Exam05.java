package example;

public class Exam05 {
	public static void main(String[] args) {
			
		int sum = 0;
		for(int i=1; i<=50; i++) { 		//위에서 나온 답안지의 숫자만 변경한 내가 적은 답안 
			if(i % 3 == 0) {			//i는 1로 선언하고 50보다 작거나 같은때까지 반복
				sum += i;			
			}
		
		System.out.println(sum);
		}
		
	}

}
