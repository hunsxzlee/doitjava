package example;

public class Exam05 {
	public static void main(String[] args) {
			
		int sum = 0;
		for(int i=1; i<=50; i++) { 		//������ ���� ������� ���ڸ� ������ ���� ���� ��� 
			if(i % 3 == 0) {			//i�� 1�� �����ϰ� 50���� �۰ų� ���������� �ݺ�
				sum += i;			
			}
		
		System.out.println(sum);
		}
		
	}

}
