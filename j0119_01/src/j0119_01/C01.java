package j0119_01;

import java.util.Scanner;

//내장객체는 import해야 사용가능-System,Math

public class C01 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch+1);//byte,short,char->+연산을 하면 int로 변환
		
		int ch2 = 65;
		System.out.println((char)ch2);
		
		String str = "aaa";
//		System.out.println(str+77-11);//에러:문자열은 (-)연산 불가능
		System.out.println(str+(77-11));
		System.out.println(77-11+str);
		
		
//		int True = 10;
//		int true;//예약어는 객체선언 안됨
//		boolean a = true;
//		boolean b = false;
//		byte c = 1;//256개(-128~127)
//		short d = 1;
//		int e = 1;
//		long f = 100000000000000L;
//		float g = 1f;//(1.0)
//		double h = 1d;//(d생략가능)(1.0)
//		char cc = 'a';//1글자만 가능
//		char cc2 = '';//빈칸 불가능
//		char cc3 = ' ';//(space 가능)

		
		
//		String str = new String("aaa");
//		System.out.println(str);
//		
//		String str2 = "bbb";//String 객체만 new를 생략가능
//		System.out.println(str2);
		
//		int a = 2_147_483_647;
//		System.out.println(a+1);
//		
//		int b = 10;
//		System.out.println(b-1);
		
		
//		//함수->메소드
//		//함수vs객체->이름():함수, 클래스:첫글자가 대문자
//		System.out.println("출력합니다.");
//		//약어:sysout=>ctrl+space
//		
//		//입력부분-객체선언
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오>>");
//		int a = scanner.nextInt();
//		//출력부분
//		System.out.println("입력값:"+a);
		
		
	}

}
