package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// 로또 프로그램
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] lotto = new int[6];

		// 1.1~45 순차정렬
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		
		// 2.정렬된 숫자열 셔플
		for(int i=0;i<200;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		// 3.섞은 숫자열 중 6개 숫자 앞에서부터 추출
		for(int i=0;i<6;i++) {
			random[i] = num[i];
		}
		System.out.println(Arrays.toString(random));
		
		// 4.1~45 숫자 6개 입력
		for(int i=0;i<6;i++) {
			System.out.printf("%d번 숫자 입력(1~45)>>",i+1);
			input[i] = scanner.nextInt();
			if (input[i]<1||input[i]>45) {//범위밖 숫자 입력시 출력
				System.out.println("잘못된 숫자. 다시 입력하세요.");
				i--;
			}
		}
		
		// 5.랜덤/선택 숫자 비교해 맞춘개수 추출
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==random[j]) {
					lotto[count]=input[i];
					count++;
					break;
				}
			}
		}
		
		// 6.결과출력
		String str = Arrays.toString(random);
		System.out.println("랜덤번호:"+str);
		System.out.println("선택번호:"+Arrays.toString(input));
		System.out.println("맞춘개수:"+count);
		System.out.print("맞춘번호:");
		for(int i=0;i<count;i++) System.out.print(lotto[i]+" ");
		System.out.println();
	}

}
