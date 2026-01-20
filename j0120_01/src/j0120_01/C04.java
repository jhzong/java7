package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//1~45 순차 정렬
		int[] random = new int[45];
		for (int i=0;i<random.length;i++) {
			random[i]=i+1;
		}
		System.out.println("순차정렬:"+Arrays.toString(random));
		//1~45 랜덤 정렬
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = random[0];
			random[0] = random[no];
			random[no]=temp;
		}
		System.out.println("랜덤정렬:"+Arrays.toString(random));
		
		// 6개 입력받아 출력
		int[] input = new int[6];
		for (int i=0;i<6;) {
			System.out.printf("%d번 번호 입력>> \n",i+1);
			int temp = scanner.nextInt();
			if (temp>0 && temp<=45) {
				input[i]=temp;
				i++;
			}else {
				System.out.println("다시입력하세요.(1~45)");
			}
		}
		System.out.println("입력번호:"+Arrays.toString(input));
		
		
		//앞6개 출력
		System.out.print("랜덤6개:");
		for(int i=0;i<6;i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		
		//맞춘개수
		for(int i=0;i<6;i++) {
			
		}
		
	}
}
