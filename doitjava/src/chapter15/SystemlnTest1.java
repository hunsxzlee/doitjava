package chapter15;

import java.io.IOException;

public class SystemlnTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}