package chaoter05;

public class CalcOverEx {
	public static void main(String[] args) {
		CalcOver myCalcu = new CalcOver();
		
		//정사각형 넒이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형 넒이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넒이 " + result1);
		System.out.println("직사각형 넒이 " + result2);
		
	}

}
