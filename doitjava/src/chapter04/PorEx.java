package chapter04;

public class PorEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num < 11) {
			sum += num;
			num++;
			
		}
		System.out.println(sum);
		
		int i = 0;  //i는 인덱스의 줄임말/인덱스는 0으로 시작
		int res = 0;
		for(i = 1; i < 11; i++)	{
			res += i;
		}
		System.out.println(res);
	}

}
/*
 *  증감식은 식이 들어가는 공간입니다.
 *  i++ -> i += 1 -> i = i + 1
 */