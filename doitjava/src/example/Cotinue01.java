package example;

public class Cotinue01 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				/* System.out.print("나머지가 앖음: "); */
//				break;  //반복문을 부수고 멈추게 하는 구문, 이것만 넣었을때 0으로 선언했을경우 한번 돌고 나면 1이 되는데, 이경우 거짓이 되어 바로 브레이크가 걸림. 
				continue;  //반복문에서 컨티뉴를 만날경우 현재 지속되는 문구를 바로 다음으로 넘기는 구문			
			}
			System.out.println(i);
		}
	}
}