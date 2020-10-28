package chapter07;

import java.lang.reflect.Array;

public class ArrayEx05 {
	public static void main(String[] args) {
		int[] iArr = {1, 2, 3};
		String[] sArr = {"일", "이", "삼"};
		for(int i =0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);		
		}
		
		int[] arr1 = {1, 2};
		int[] arr2 = {3, 4};
		int[][] array = new int[2][];   //대괄호 2개면 2차원, 3개면 3차원
		array[0] = arr1;
		array[1] = arr2;
		
		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);			//array[0], array[1] 출력
			for(int j = 0; j < arr1.length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}