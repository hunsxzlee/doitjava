package chaoter05;

public class Student {
	//�ʵ� - ��� ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//������ - ��ü�� ������ �����ϴ� ���
	Student(int num1, long num2) {	
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(int num3, int num4) {	
		System.out.println("Student ��ü�� �����մϴ�. ");		//Ÿ���� �ٸ��Ը� �޴´ٸ� ����ó�� ����� ��������
	}															//������ �̸��� ���Ƶ� ��� ����
	Student(long num5, int num6) {	
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(int num) {	
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	Student(long num) {	
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}				//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
	Student() {		//����Ʈ ������: �����ڸ� ������� ������ �ڵ����� ����
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�. ");		//����Ʈ �����ڴ� �� �߰����ִ°��� ����
	}
	//�żҵ�(�޼���) - ��� �Լ�
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}	
}