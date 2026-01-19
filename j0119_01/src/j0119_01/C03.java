package j0119_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 예제)숫자 5개를 입력, 합계 출력. 12345=15
		System.out.println("숫자를 입력하시오>>");
		String num = scanner.next();
		char ch1 = num.charAt(0);
		char ch2 = num.charAt(1);
		char ch3 = num.charAt(2);
		char ch4 = num.charAt(3);
		char ch5 = num.charAt(4);
		System.out.printf("%s + %s + %s + %s + %s\n",ch1,ch2,ch3,ch4,ch5);
		System.out.printf("=%d\n",(ch1-'0')+(ch2-'0')+(ch3-'0')+(ch4-'0')+(ch5-'0'));
		
		
//		// 1+3=4
//		System.out.println("숫자를 입력하시오>>");
//		String num = scanner.next();
//		char ch1 = num.charAt(0);
//		char ch2 = num.charAt(1);
//		System.out.println(ch1+","+ch2);
//		System.out.printf("결과값: %d\n",(ch1-'0')+(ch2-'0'));
		
//		System.out.println("숫자1를 입력하시오>>");
//		int num1 = scanner.nextInt();
//		System.out.println("숫자2를 입력하시오>>");
//		int num2 = scanner.nextInt();
//		System.out.printf("숫자1:%d, 숫자2:%d",num1,num2);
		
		
		scanner.close();
		
//		int i = 'b'- 'a';
//		System.out.println(i);
//		
//		int j = '2' - '0';
//		System.out.println(j);
//		
//		int k = '5' - '0';
//		System.out.println(k);
//		
//		char ch = '5';
//		int num = (int)ch;
//		System.out.println(num);
		
//		char ch1 = 'a';
//		char ch2 = ch1 + 1;//에러
//		int ch2 = ch1 +1;
//		System.out.println((char)ch1);//a
//		System.out.println(ch2);//98
//		System.out.println((char)ch2);//b
//		char ch3 = ch1++;// char특징:증감연산 가능
//		char ch4 = ++ch1;
//		System.out.println(ch3);
//		System.out.println(ch4);
		
		
//		int a = 1_000_000;
//		int b = 2_000_000;
//		long c = (long)a * b;
//		System.out.println(c);
		
		
		
//		//단항연산자(부호)
//		int a = -10;
//		System.out.println(a);
//		int b = 10;
//		System.out.println(b);
//		
//		//(단항)증감연산자
//		a++;//a+=1→a=a+1
//		b--;//b-=1→b=b-1
//		
//		//논리연산자 : &&(and), ||(or)
//		
//		//산술연산(+,-,*,/,%)
//		System.out.println(10+3);
//		System.out.println(10+3);
//		System.out.println(10*3);
//		System.out.println(10/3);
//		System.out.println(10%3);
//		
//		//비교연산자(>,<,>=,=<,!=)
//		
//		//삼항연산자
//		String str = (a>b)?"T":"F";
//		System.out.println(str);
		
	}

}
