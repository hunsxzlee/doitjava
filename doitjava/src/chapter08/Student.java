package chapter08;

public class Student extends People {
	//�ʵ�
	public int studentNo;
	
	//������
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //�θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}