package chaoter05;

public class Student {
	//필드 - 멤버 변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//생성자 - 객체를 생성할 실행하는 블록
	Student(int num1, long num2) {	
		System.out.println("Student 객체를 생성합니다. ");
	}
	Student(int num3, int num4) {	
		System.out.println("Student 객체를 생성합니다. ");		//타입을 다르게만 받는다면 왼쪽처럼 출력이 가능해짐
	}															//변수의 이름은 같아도 상관 없음
	Student(long num5, int num6) {	
		System.out.println("Student 객체를 생성합니다. ");
	}
	Student(int num) {	
		System.out.println("Student 객체를 생성합니다. " + num);
	}
	Student(long num) {	
		System.out.println("Student 객체를 생성합니다. " + num);
	}				//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자
	Student() {		//디폴트 생성자: 생성자를 명시하지 않으면 자동으로 생성
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다. ");		//디폴트 생성자는 늘 추가해주는것이 좋다
	}
	//매소드(메서드) - 멤버 함수
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}	
}