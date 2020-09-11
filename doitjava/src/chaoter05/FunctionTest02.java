package chaoter05;

import java.util.*;

public class FunctionTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student();	//새로운 객체 생성
		Student seo = new Student();	//새로운 객체 생성
		
		System.out.println(kim == seo);	//두 객체는 같은 객체가 아니다.
		
		//method 호출
		kim.showStudentInfo();  //객체는 초기값이 null이고, int는 0이고, boolean은 false이다.
		
		/*객체의 멤버는 도트연산자(.)을 이용하여 접근할 수 있습니다.*/
		
		kim.studentID = 2020010001;
		kim.studentName = "김유신";
		kim.grade = 3;
		kim.address = "경주";
		kim.showStudentInfo();
		
		seo.studentID = 202001002;
		seo.studentName = "서유진";
		seo.grade = 1;
		seo.address = "서울";
		seo.showStudentInfo();
		
		Student jo = new Student();
		jo.studentID = 202001002;
	}
}