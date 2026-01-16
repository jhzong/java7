package j0116_01;

public class Class0116_03 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		
		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041';
		char tab = '\t';
		char ent = '\n';
		System.out.print(ch);
		System.out.print(tab);
		System.out.print(ch2);
		System.out.print(ent);
		System.out.print(ch3);
		
		char ch4 = 'a';//에러
		System.out.println(ch4);
		//char ch5 = '';//''X
		char ch6 = ' ';//' ' 가능
		System.out.println(ch6);

		String str = "";// ""가능
		System.out.println(str);
		
		String str2 = "7";
		// "7"+7+7
		System.out.println(str2);
		
		String str3 = "aaa";
		//str3+7="aaa7"
		System.out.println(str3+7);
		
		int a = 7;
		int b = 8;
		String str4 = "7";
		System.out.println(a+b+str4);
	}
}
