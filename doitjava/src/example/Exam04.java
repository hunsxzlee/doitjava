package example;

public class Exam04 {

	public static void main(String[] args) {
		
		int num = 2;   //���� ���� ��
		num += 4;
		num += 6;
		num += 8;
		num += 10;
		
		System.out.println("1���� 10������ �� �� ¦������ ���� " + num + "�Դϴ�.");
		
		int sum =0;
		for(int i=1; i<=10; i++) {  //������
			if(i % 2 == 0) {		//����  ����i�� 10���� �۰� 2�� �������� 0�̵Ǵ� ���̸� ���϶�
				sum += i;			
			}
		}
		System.out.println(sum);
		
	}

}
