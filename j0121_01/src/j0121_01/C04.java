package j0121_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {

		//학생성적-이름,국어,영어,수학,합계,평균
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[2];
		int[][] score = new int[2][4];
		double[] avg = new double[2];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		System.out.println("           [성적입력 프로그램]              ");
		System.out.println("---------------------------------------");
		//1.성적입력
		int i=0;
		while(i<2) {
			System.out.println("이름 입력>>");
			name[i] = scanner.next();
			int total = 0;
			for(int j=0;j<3;j++) {
				System.out.printf("%s 점수 입력>>",title[j+1]);
				score[i][j] = scanner.nextInt();
				total += score[i][j];
			}
			score[i][3] = total;
			avg[i]=total/3.0;
			i++;
		}
		scanner.close();
		
		//2.성적출력
		System.out.println("              [성적출력]                ");
		System.out.println("---------------------------------------");
		
		for(int j=0;j<title.length;j++) {
			System.out.print(title[j]+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		//이름,국어,영어,수학,합계,평균
		for(int j=0;j<score.length;j++) {
			//이름
			System.out.print(name[j]+"\t");
			for(int k=0;k<score[j].length;k++) {
				//국어,영어,수학,합계
				System.out.print(score[j][k]+"\t");
			}
			System.out.printf("%.2f\n",avg[j]);
		}
		
		
		//2차배열
//		int[][] score = {
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0}
//		};
//		int[][] score = new int[5][5];
//		int[] a = new int[25];
//		//1차 숫자열 만들기()
//		for(int i=0;i<a.length;i++) {
//			a[i]=i+1;
//		}
//		
//		//셔플
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*25);
//			int temp = a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}
//		
//
//		//2차배열 삽입
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j]=a[5*i+j];//0~24
//				score[i][j]=5*i+j+1;//1~25
//			}
//		}
//		
//		//2차배열 출력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		//1차배열-순차숫자열 셔플 입력,출력
//		int[] a = {1,2,3};
//		int[] a = new int[25];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1;
//		}
//		
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*25);
//			int temp=a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}

	}

}
