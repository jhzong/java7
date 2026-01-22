package j0122;

import java.util.Scanner;

public class C10 {
	static Scanner scanner = new Scanner(System.in);
	
	static void stuInput(int[] score) {
		System.out.println("국어 점수>>");
		score[0]=scanner.nextInt();
		System.out.println("영어 점수>>");
		score[1]=scanner.nextInt();
		System.out.println("수학 점수>>");
		score[2]=scanner.nextInt();
		
		
	}
	
	public static void main(String[] args) {
		
		int[] score = new int[3];
		
		stuInput(score);
		
		System.out.printf("국어:%d,영어:%d,수학:%d",score[0],score[1],score[2]);

	}

}
