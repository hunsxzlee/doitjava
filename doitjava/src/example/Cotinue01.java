package example;

public class Cotinue01 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				/* System.out.print("�������� ����: "); */
//				break;  //�ݺ����� �μ��� ���߰� �ϴ� ����, �̰͸� �־����� 0���� ����������� �ѹ� ���� ���� 1�� �Ǵµ�, �̰�� ������ �Ǿ� �ٷ� �극��ũ�� �ɸ�. 
				continue;  //�ݺ������� ��Ƽ���� ������� ���� ���ӵǴ� ������ �ٷ� �������� �ѱ�� ����			
			}
			System.out.println(i);
		}
	}
}