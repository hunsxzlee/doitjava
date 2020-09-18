package chapter11;

class Student {
	int studentId;
	String studentname;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentname = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentname;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �������� �ʽ��ϴ�.");
		
		
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �ּҴ� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �������� �ʽ��ϴ�.");
	}
}