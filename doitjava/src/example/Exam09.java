package example;

public class Exam09 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i= 1; i<=50; i++) {
			sum += i;
		}
		double res = (double)sum /50;    //���⼭ sum�� ��Ʈ�� �Ҽ����� ������ ��, �׷��� ������ �־� ������ ��ȯ����� ���ϴ� ������� ����
		System.out.println(res);
	}

}
