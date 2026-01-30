package j0130;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C07 {

	public static void main(String[] args) {
		String filrPath = "c:/aaa/a1.txt";
		try {
			// 설정이 없으면:덮어쓰기, true:
			FileWriter fw = new FileWriter(filrPath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "Hello World!!\r\n";// \r:줄의 제일 끝으로 이동,\n:엔터키
			bw.write(txt);
			
			bw.close();
			fw.close();
			System.out.println("저장완료.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
