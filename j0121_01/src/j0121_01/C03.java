package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//5x5 1~25
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int[][] score = new int[5][5];
		
		//순차정렬한 숫자열 삽입(1차배열->2차배열)
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = num[5*i+j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 5*i+(j+1);
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		//1차원 순차배열
//		int[] score = new int[5];
//		for(int i=0;i<score.length;i++) {
//			score[i]=i+1;
//		}
		
		
		
		
//		//2차원 [4][4]
//		//1~25 값울 입력하여 출력
//		int[][] score = {
//				{1,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15},
//				{16,17,18,19,20},
//				{21,22,23,24,25}
//		};
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		//3행2열,5행1열,2향4열,5행5열
//		System.out.println("3행2열:"+score[2][1]);
//		System.out.println("5행1열:"+score[4][0]);
//		System.out.println("2향4열:"+score[1][3]);
//		System.out.println("5행5열:"+score[4][4]);
		
		
//		//1차원 배열
//		int[] a = {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		
//		//다차원 배열
//		int[][] score = {
//				{100,100,100},
//				{90,90,90},
//				{80,80,80}
//		};
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}

}
