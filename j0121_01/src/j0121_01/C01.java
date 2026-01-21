package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// 0.객체선언
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int count = 0;
		
		// (1).1~45를 순차정렬
		for(int i=0;i<45;i++) num[i] = i+1;
		
		// (2).(1)을 셔플
		for(int i=0;i<300;i++) {
			int rdm = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[rdm];
			num[rdm] = temp;
		}
		
		// (3).(2)에서 0~5 번호 추출
		for(int i=0;i<6;i++) lotto[i] = num[i];
		System.out.println("선택번호:"+Arrays.toString(lotto));
		
		// (4).1~45 임의번호 6개 입력
		for(int i=0;i<6;) {
			System.out.printf("%d번 번호입력(1~45)>> ",(i+1));
			input[i] = scanner.nextInt();
			if(input[i]>0 && input[i]<46) i++;
			else System.out.println("잘못된 번호. 다시 입력하세요.");
		}
		scanner.close();
		
		// (5).(3)과 (4)를 비교. 정답번호와 정답개수 추출
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = input[i];
					count++;
					break;
				}
			}
		}
		
		// (6).결과출력
		System.out.println("로또번호"+Arrays.toString(lotto));
		System.out.println("선택번호:"+Arrays.toString(input));
		System.out.print("정답번호:");
		for(int i=0;i<count;i++) System.out.print(answer[i]+" ");
		System.out.println();
		System.out.println("정답개수:"+count);
		
		
	}

}
