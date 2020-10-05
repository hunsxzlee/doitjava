package chapter14;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("정상실행 했습니다.");
		} catch(ArithmeticException e) {
			System.out.println("산술 연산에 문제가 발생하였습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어났습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("파이널리는 무조건 실행되는 구간입니다.");
		}
		
		
	}

}