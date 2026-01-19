package j0119_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// 변수 - boolean,char,(정수:byte,int,short,long),
		// (실수:float,double),String
		// Scanner->(String) next(),nextLine()
		// nextBoolean(),nextInt(),nextLong,nextDouble(),nextFloat()
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오>>");
		String name = scanner.next();// 사이띄움 안됨, enter키 입력없음.
		System.out.println("이름 : "+name);
		
		
		
//		// 예제(교제53p_Q6)
//		System.out.println("안녕"+5.8);
//		System.out.print(3+5+"방가"+4+2);
//		System.out.printf(" %s:%d","홍길동", 15);
		
		
//		// 예제)이름, 실수(소수점 3째 자리까지) 입력. 소수점 1째자리까지 출력
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하시오>>");
//		String name = scanner.next();
//		System.out.println("실수를 입력하시오>>");
//		Double num = scanner.nextDouble();
//		
//		System.out.printf("%s, %.1f",name,num);
		scanner.close();
		
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a/(double)b);
//		// printf() : 소수점,공백크기,공백->0 표시 가능
//		System.out.printf("%.2f",(a/(double)b));
		
	}

}
