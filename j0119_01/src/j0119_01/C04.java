package j0119_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 예제) 국어,영어,수학을 입력. 과목 성적과 합계,평균 출력.
		// 홍길동,100,100,90,299,99.33
		System.out.println("이름을 입력하시오>>");
		String name = scanner.next();
		System.out.println("국어 성적>>");
		int kor = scanner.nextInt();
		System.out.println("영어 성적>>");
		int eng = scanner.nextInt();
		System.out.println("수학 성적>>");
		int math = scanner.nextInt();
		int sum = kor+eng+math;
		double avg = sum/3.;
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name,kor,eng,math,sum,avg);
		
		
//		System.out.println("숫자를 입력하시오>>");
//		int input = scanner.nextInt();
//		String result = ((input%2)==0)?"짝수":"홀수";
//		System.out.println(result);
		
//		double a = .1;
//		float b = .1f;
//		
//		String result = (a==b)?"a와 b는 같다.":"a와 b는 다르다.";
//		System.out.println(result);
//		System.out.println((double)b);
//		
//		float c = (float)a;
//		String result2 = (c==b)?"c와 b는 같다.":"c와 b는 다르다.";
//		System.out.println(result2);
		
		
		
		
//		System.out.println("실수를 입력하시오>>");
//		
//		int a = 10;
//		System.out.println(10*100/100);
		
		
		
//		double input = scanner.nextDouble();
		
//		// 소수점 2자리 34.195->34.3
//		double result = (int)(input*100)/100.0;//절사
//		double result = Math.round(input*10)/10.0;
//		System.out.println(result);
		
//		// 소수점 3자리 반올림,올림,버림
//		double result1 = Math.round(input*100)/100.;
//		double result2 = Math.ceil(input*100)/100.;
//		double result3 = Math.floor(input*100)/100.;
//		
//		System.out.printf("반올림:%.1f, 올림:%.1f, 버림:%.1f",result1,result2,result3);
//		System.out.printf("반올림:%.2f, 올림:%.2f, 버림:%.2f",result1,result2,result3);
		
		
		
		
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
