package example;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.println("[" + i + "] : " + arr[i]);
		}
	}
}