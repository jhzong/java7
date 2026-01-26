package j0126;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// 클레스 끼리 정보 공유 - 객체선언
		
		//예제)
		//main에서 입력받아, 입력값을 arr에 리턴받아 출력
		//5입력->[1*5,2*5,3*5]]
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력>>");
		int num = scanner.nextInt();
		
		//객체선언 후 매개변수로 전달
		CMethod cm = new CMethod();
		int[] arr = cm.method(num);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		scanner.close();
	}

}
