package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
			){
			millisecond = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데" + millisecond + " millisecond 소요되었습니다.");	
	}
}