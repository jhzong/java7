package j0129;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("c:/aaa/a2.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
		
//		Scanner scanner = new Scanner(System.in);
//
//		TryClass t = new TryClass();
//		try {
//			t.method();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램종료");
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);//error
//			System.out.println(4);
//			System.out.println(5);
//			throw new Exception("고의에러");//강제 에러발생
//		} catch (Exception e) {
//			System.out.println(6);
//			System.out.println(e.getMessage());//에러 문구 출력
//			e.printStackTrace();// 에러정보(위치,메세지 출력)
//		}
//		System.out.println(7);
		
		
		
		// 컴파일에러 - 명령어 오타
//		System.out.printl("안녕");
//		System.out.println("안녕");
		
		// 럼타임 - 실행시 발샹
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		System.out.println("값 입력>>");
//		int b = scanner.nextInt();
//		System.out.println(b);
//		a[3] = b;//
		
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr.length);
//		arr[2] = 0;
//		System.out.println(arr.length);
		
//		Stuscore s = new Stuscore("홍길동", 100, 100, 99);
//		System.out.println(s);
//		System.out.println(s.getName());
//
//		String str = "aaa";
//		String str2 = "bbb";
//		if(str.equals(str2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
	}

	private static FileReader FileReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
