package j0123;

import java.util.Scanner;

public class Method {
	
	static Scanner scanner = new Scanner(System.in);
	
	//avg()
	double avg(int a,int b) {
		double result = (a+b)/2.0;
		return result;
	}
	
	//total()
	int total(int a,int b,int c) {
		int result = a+b+c;
		return result;
	}
	
	//input() 2개의 값을 입력받아 합을 리턴
	void input() {
		System.out.print("a입력>>");
		int a = scanner.nextInt();
		System.out.print("b입력>>");
		int b = scanner.nextInt();
		int result = a+b;
		
		System.out.println("a+b="+result);
	}
	
	//input2() 합의 값을 리턴
	int input2() {
		System.out.print("a>>");
		int a = scanner.nextInt();
		System.out.print("b>>");
		int b = scanner.nextInt();
		return a+b;
	}
	
	// 1.리턴 없이 사칙연산 및 출력
	// 2.2개의 숫자를 입력받아 합,차,곱,분의 값을 리턴
	void cal() {
		System.out.print("a>>");
		int a = scanner.nextInt();
		System.out.print("b>>");
		int b = scanner.nextInt();
		int add = a+b;
		int sub = a-b;
		int multi = a*b;
		double divide = a/(double)b;
		
		System.out.printf("%d, %d, %d, %.2f",add,sub,multi,divide);
	}

	int[] cal2() {
		int[] result = new int[3];
		System.out.print("a>>");
		int a = scanner.nextInt();
		System.out.print("b>>");
		int b = scanner.nextInt();
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		
		return result;
	}

	// 배열,객체를 매개변수로 보낼때 return (X)
	// 기본타입 8개 -> return 반드시 필요
	void cal3(int[] result) {
		System.out.print("a>>");
		int a = scanner.nextInt();
		System.out.print("b>>");
		int b = scanner.nextInt();
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		
	}
}
