package j0116_01;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		// Scanner
		// 타입크기순서 byte<short,char<int<long<float<double<String
		Scanner scanner = new Scanner(System.in);
		
		int a = 5;
		int b = 0;
		a++;
		b=a;
		System.out.println(a);
		System.out.println(b);
		
		
//		// 예제3) 세값을 정렬
//		int a = 5;
//		int b = 10;
//		int c = 7;
//		// 최대값
//		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
//		// 최소값
//		int min = (a<b)?((a<c)?a:c):((b<c)?b:c);
//		//(a+b+c)-최대값-최소값=중간값
//		int mid = (a+b+c) - max - min;
//		// 최대,중간,최소
//		System.out.printf("큰수부터 정렬 : %d, %d, %d \n",max,mid,min);
				
//		// 예제2) 3개의 숫자를 입력. 가장 큰수를 출력.
//		int result = Math.max(5, 10, 7);
//		System.out.println("숫자를 입력>>");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//		int result = (a>b)?((a>c)?a:c):((b>c)?b:c);//※삼항연산자
//		System.out.println("최대값:"+result);
		
		
		
		
//		int a = 10;
//		int b = 3;
//
//		// 삼항연산자 
//		System.out.println("숫자를 입력하시오>>");
//		a = scanner.nextInt();
//		String result = (a>0)?"0 보다 큽입니다.":"0보다 작습니다."
//		System.out.println(result);
		
		// 논리연산자 (a>5)&&(b<5),(a>11)||(b<5)
		
		
		
//		// 비교연산자
//		System.out.println(a<b);
//		System.out.println(a>b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
		
		
//		// 산술연산자
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);//나머지
		
//		// 예제1)이름,국어,영어 입력=> 이름,국어,영어,합계,평균 출력
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름 입력>>");
//		String name = scanner.next();
//		System.out.println("이름 국어>>");
//		int kor = scanner.nextInt();
//		System.out.println("이름 영어>>");
//		int eng = scanner.nextInt();
//		int sum = kor + eng;
//		double avg = sum/2.0;
//		System.out.printf("이름:%s,국어:%d,영어:%d,합계:%d,평균:%.2f",name,kor,eng,sum,avg);
//		scanner.close();
		
		
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/(double)b);//3.33333->정수/정수=정수3
//		
//		boolean bol = true;
//		System.out.println(!bol);
		
		
		
//		System.out.println(2.0*100);
//		//증감연산자(+/-)
//		//a=a+1
//		a += 1;
//		a++;
//		//a=a-1
//		a--;
//		System.out.println(a);
	}

}
