package j0116_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1.2345678);
		System.out.println(10/(double)3);// 10/3.0
		
		// printf->%
		
		System.out.printf("%05d, %.2f", 123, 10/(double)3);
		// "%05d"<-123, "%.2f"<-12/(double)3
		
		//출력
		System.out.println();
		
		//입력 - System : console에서 입력을 받겠다.
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자를 입력하시오>>");
		int num = scanner.nextInt();//정수타입 값을 받음
		System.out.println("입력숫자 :"+num);
		
		
	}

}
