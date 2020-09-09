package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해 주세요: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("Max: " + arr[arr.length-1]);
//		System.out.println("Min: " + arr[0]);
		sc.close();
	}
}
