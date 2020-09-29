package chapter13.stream;

import java.util.Arrays; 
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);
		
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average().getADouble();
		
		System.out.println("��� ����: " + avg);
	}

}
