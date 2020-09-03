package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int sum1 = 0;
		for(int i = 0; i < arr1.length; i++) {		//선언한 범위만 출력이 가능하다
			sum1 += arr1[i];
		}
		System.out.println(sum1);
		
		int [] arr2 = new int[10];		//같은 자료형(int면 int)으로 해야 출력됨
		int sum2 = 0;					//숫자 자료형은 모두 기본적으로 0으로 초기화됨
		for(int i = 0; i <arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		int[] arr3 = new int[] {1, 2, 3, 4, 5 };
		for(int i = 0; i <arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}