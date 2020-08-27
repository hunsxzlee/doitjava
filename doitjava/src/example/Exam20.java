package example;

import java.util.HashSet;
import java.util.Set;

public class Exam20 {
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> set = new HashSet<Integer>();   //Set는 숫자를 담을수 잇는 박스같은 존재
		while(set.size() < 6) {
			num = (int)(Math.random() * 48) +1;
			set.add(num);
		}
		for(int n:set) {
			System.out.print(n + " ");
		}
	}

}
