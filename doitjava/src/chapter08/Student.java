package chapter08;

public class Student extends People {
	//필드
	public int studentNo;
	
	//생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 생성자 호출
		this.studentNo = studentNo;
	}
}