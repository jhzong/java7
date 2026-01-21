package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C07_prac2 {

	public static void main(String[] args) {
		//0.객체선언
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		
		//1.1~45 순차정렬
		for(int i=0;i<45;i++) num[i] = i+1;
		
		//2.(1)을 셔플
		for(int i=0;i<300;i++) {
			int rdm = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[rdm];
			num[rdm] = temp;
		}
		
		//3.(2)에서 앞에서 숫자6개 추출
		for(int i=0;i<6;i++) {
			lotto[i] = num[i];
		}
		System.out.println(Arrays.toString(lotto));
		
		//4.1~45 중 임의로 6개 입력
		for(int i=0;i<6;) {
			System.out.println("(1~45)번호를 선택하시오.>>");
			input[i] = scanner.nextInt();
			if(input[i]>0 && input[i]<46) i++;
			else System.out.println("잘못된 번호. 다시 입력하시오.");
		}
//		System.out.println(Arrays.toString(input));
		
		//5.(3)과 (4)를 비교. 정답번호와 개수 추출.
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = input[i];
					count++;
					break;
				}
			}
		}
		
		//6.결과출력(로또번호,선택번호,정답번호,정답개수)
		System.out.println("로또번호"+Arrays.toString(lotto));
		System.out.println("선택번호"+Arrays.toString(input));
		System.out.print("정답번호:");
		for(int i=0;i<count;i++) System.out.print(answer[i]+" ");
		System.out.println();
		System.out.println("정답개수:"+count);
		
	}

}
