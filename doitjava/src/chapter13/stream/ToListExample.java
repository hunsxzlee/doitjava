package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ToListExample {
	public static void main(String[] args) {
		List<Student02> totalList = Arrays.asList (
				new Student02("홍길동", 10, Student02.Sex.MALE),
				new Student02("김수애", 6, Student02.Sex.FEMALE),
				new Student02("신용권", 10, Student02.Sex.MALE),
				new Student02("박수미", 6, Student02.Sex.FEMALE)
		);
		
		List<Student02> maleList = totalList.stream().filter(s -> s.getSex() == Student02.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		Set<Student02> femaleSet = totalList.stream().filter(s -> s.getSex() == Student02.Sex.FEMALE)
				.collect(Collectors.toCollection(() -> new HashSet<Student02>()));
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
	}

}
