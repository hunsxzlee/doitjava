package example;

import java.util.HashSet;
import java.util.Set;

public class Exam20 {
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> set = new HashSet<Integer>();   //Set�� ���ڸ� ������ �մ� �ڽ����� ����
		while(set.size() < 6) {
			num = (int)(Math.random() * 48) +1;
			set.add(num);
		}
		for(int n:set) {
			System.out.print(n + " ");
		}
	}

}
