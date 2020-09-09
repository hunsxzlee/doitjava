package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("로또생성기입니다. 몇 게임을 생성하시겠습니까?:");
		int game = sc.nextInt();
		for(int z=0; z < game; z++) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {  //서로의 수가 같은 경우 i의 수를 하나 빼라
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {	
			System.out.print(arr[i] + " ");		
			}
		}
		sc.close();
	}
}