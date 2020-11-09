package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while((i=isr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}