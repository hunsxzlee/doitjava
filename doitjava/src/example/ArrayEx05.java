package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζǻ������Դϴ�. �� ������ �����Ͻðڽ��ϱ�?:");
		int game = sc.nextInt();
		for(int z=0; z < game; z++) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {  //������ ���� ���� ��� i�� ���� �ϳ� ����
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