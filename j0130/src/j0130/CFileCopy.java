package j0130;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CFileCopy {

	public static void main(String[] args) {
		// 이미지 파일복사
		File f = new File("c:/aaa/aespa01.webp");
		try {
			FileInputStream fis = new FileInputStream(f);
			// 파일저장
			FileOutputStream fos = new FileOutputStream("c:/bbb/aespa11.webp");
			while (true) {
				int read = fis.read();
				if (read==-1) break;
				fos.write(read);
			}
			fis.close();
			fos.close();
			System.out.println("파일복사됨.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
