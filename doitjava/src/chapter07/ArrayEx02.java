package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int sum1 = 0;
		for(int i = 0; i < arr1.length; i++) {		//������ ������ ����� �����ϴ�
			sum1 += arr1[i];
		}
		System.out.println(sum1);
		
		int [] arr2 = new int[10];		//���� �ڷ���(int�� int)���� �ؾ� ��µ�
		int sum2 = 0;					//���� �ڷ����� ��� �⺻������ 0���� �ʱ�ȭ��
		for(int i = 0; i <arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();       //���� ����
		int[] arr3 = new int[] {1, 2, 3, 4, 5 };
		for(int i = 0; i <arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr1 = new int[] { 1, 2, 3, 4, 5 };		//������ �ѹ� ����� ���� �ٸ������� ������ �Ұ����ϳ�, �ƿ� ���� ������ ������(�ڹٸ� ����, �ٸ����� �Ұ���)
	}
}