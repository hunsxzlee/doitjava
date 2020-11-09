package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest0 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			FileOutputStream fos = new FileOutputStream("input2.txt");
			for(int i=65; i<65+27; i++) {
				fos.write((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}