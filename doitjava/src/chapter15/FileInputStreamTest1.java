package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
	try {
		fis = new FileReader("C:\\Users\\yn-20\\git\\doitjava\\src\\chapter15\\input.txt");
		int word;
		while((word = fis.read()) != -1) {
			System.out.println((char)word);
		}
	} catch (IOException e) {
		System.out.println(e);
	} finally {
	try {
		fis.close();	
	} catch (IOException e) {
		System.out.println(e);
	} catch (NullPointerException e) {
		System.out.println(e);
		}
	}
	System.out.println("end");
	}
}