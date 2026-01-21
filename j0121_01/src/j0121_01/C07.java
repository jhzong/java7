package j0121_01;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		// 스무고개 프로그램
		// 랜덤번호 생성(1~100)
		// 10번안에 맞추는 프로그램
		// 정답을 맞추면 프로그램 종료.
		// 입력번호,도전횟수,정답번호 출력
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[10];
		int count = 0;
		// 1.번호생성
		int rdm = (int)(Math.random()*100)+1;
		
		// 2.10회 선택
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 시도>>",(count+1));
			input[i]=scanner.nextInt();
			if(rdm==input[i]) {
				System.out.println("정답!!");
				break;
			}else if(rdm>input[i]) {
				System.out.println("UP");
			}else {
				System.out.println("DOWN");
			}
			count++;
		}
		scanner.close();
		
		// 3.결과출력
		System.out.println("입력번호:");
		for(int i=0;i<count;i++) System.out.print(input[i]+" ");
		System.out.println();
		System.out.println("도전횟수:"+count);
		System.out.println("정답번호:"+rdm);
		

	}

}
