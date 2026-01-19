package j0119_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수를 입력하시오>>");
		double input = scanner.nextDouble();
		
//		// 소수점 2자리 34.195->34.3
//		double result = (int)(input*100)/100.0;//절사
//		double result = Math.round(input*10)/10.0;
//		System.out.println(result);
		
		// 소수점 3자리 반올림,올림,버림
		double result1 = Math.round(input*100)/100.;
		double result2 = Math.ceil(input*100)/100.;
		double result3 = Math.floor(input*100)/100.;
		
		System.out.printf("반올림:%.1f, 올림:%.1f, 버림:%.1f",result1,result2,result3);
		
		
		
		
//		// 소수1자리에서 => 반올림:round, 올림:ceil , 버림:floor
//		System.out.println(Math.round(3.592));
//		System.out.println(Math.ceil(5.12));
//		System.out.println(Math.floor(6.99));
		
//		//절사
//		// 예제)숫자를 입력받아 소수점 2째자리에서 절사해 출력.
//		System.out.println("숫자를 입력>>");
//		//3.141592->3.14
//		double input = scanner.nextDouble();
//		double result = (int)(input*100)/100.0;
		
		
//		System.out.println("결과값:"+result);
	}

}
