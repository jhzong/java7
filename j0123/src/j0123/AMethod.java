package j0123;

import java.util.Scanner;

public class AMethod {
	static Scanner scanner = new Scanner(System.in);
	
	void input(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println("숫자 입력>>");
			num[i] = scanner.nextInt();
			
		}

	}
}
