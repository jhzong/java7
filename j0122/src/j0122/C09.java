package j0122;

import java.util.Scanner;

public class C09 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static int[] stuInput() {
//		int kor=0;
//		int eng=0;
//		int math=0;
		int[] score=new int[3];
		System.out.println("국어점수>>");
		score[0]=scanner.nextInt();
		System.out.println("영어점수>>");
		score[1]=scanner.nextInt();
		System.out.println("수학점수>>");
		score[2]=scanner.nextInt();
		
		return score;
	}

	static void stuInput(int[] score) {
//		int kor=0;
//		int eng=0;
//		int math=0;
		System.out.println("국어점수>>");
		score[0]=scanner.nextInt();
		System.out.println("영어점수>>");
		score[1]=scanner.nextInt();
		System.out.println("수학점수>>");
		score[2]=scanner.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		int[] score=new int[3];
		
		//점수 출력
		stuInput(score);
		
		System.out.println(score[0]+","+score[1]+","+score[2]);
		
		
		
//		//객체선언
//		MainMethod m = new MainMethod();
//		//주소값 매개변수 전달하면 값이 변경됨.
//		Stuscore[] stuArr = new Stuscore[10];
//		m.stuInput(stuArr);
//		m.stuOutput(stuArr);
		
	}

}
