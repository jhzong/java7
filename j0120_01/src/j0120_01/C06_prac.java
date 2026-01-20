package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C06_prac {
	
	public static void main(String[] args) {
		// 로또 프로그램
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] rdm = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		
		// 1.1~45 순차정렬
		for(int i=0;i<45;i++) {
			num[i] = i+1;
		}
		
		// 2.정렬된 숫자열 셔플
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		// 3.섞은 숫자열 중 6개 숫자 앞에서부터 추출
		for(int i=0;i<6;i++) {
			rdm[i]=num[i];
		}
//		System.out.println(Arrays.toString(rdm));
		
		// 4.1~45 숫자 6개 입력
		for(int i=0;i<6;) {
			System.out.println("번호 입력>>");
			input[i] = scanner.nextInt();
			if (input[i]>0 && input[i]<46) i++;
			else System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}
		scanner.close();
		
		// 5.랜덤/선택 숫자 비교해 맞춘개수+번호 추출
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==rdm[j]) {
					answer[count]=rdm[j];
					count++;
					break;
				}
			}
		}
		
		// 6.결과출력
		System.out.println("로또번호:"+Arrays.toString(rdm));
		System.out.println("선택번호:"+Arrays.toString(input));
		System.out.print("맞춘번호:");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		System.out.println("맞춘개수:"+count);
	}
}
