package j0116_01;

public class Class0116_02 {

	public static void main(String[] args) {
		//기본형 타입
		// boolean : true or false
		boolean aa = true;
		boolean aa2 = false;
		System.out.println(aa);
		System.out.println(aa2);
		
		//char : 문자
		char bb = 'a';
		char bb2 = '1';//문자 1
		System.out.println(bb);
		System.out.println(bb2);
		
		//숫자 - 정수 : byte,short,int,long
		//byte : -128~+127('0'포함)
		byte cc = 1;
		byte cc2 = 127;
		byte cc3 = (byte) 128;//overflow
		System.out.println(cc);
		System.out.println(cc2);
		System.out.println(cc3);
		
		//short
		short dd = 1;
		short dd2 = 30000;
		System.out.println(dd);
		System.out.println(dd2);
		
		//
		int ee = 1;
		int ee2 = (int) 3300_000_000L;//overflow
		System.out.println(ee);
		System.out.println(ee2);
		
		//long
		long ff = 1;
		long ff2 = 220_000_000L;//접미사 'L' 무조건 붙여야함,21억 밑으로는 생략가능.
		System.out.println(ff);
		System.out.println(ff2);
		
		//실수 : float, double
		float gg = 1.12345678F;//접미사 'F' 무조건 붙여야함
		double hh = 1.123456789123456789;//접미사 'D'는 생략 가능
		System.out.println(gg);
		System.out.println(hh);
		
		//---------------------------------------------------
		
		// 참조형 변수(객체변수-첫글자 대문자) - 무조건 new 객체명()
		// 문자열 변수 - 일반형 변수처럼 선언 가능
		String str = new String("aaa");
		String str2 = "bbb";
		System.out.println(str);
		System.out.println(str2);
		
		int abc = 10;
		abc = 20;
		abc = 30;
		System.out.println(abc);
		
		final int AAA = 100;//상수는 대문자 권장
		System.out.println(AAA);
		
		char ch = '\u0041';//16진수
		System.out.println(ch);
	}

}
