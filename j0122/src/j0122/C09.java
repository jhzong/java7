package j0122;

import java.util.Scanner;

public class C09 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static void stuInput(int kor,int eng,int math,int[] score) {

		System.out.println("국어점수>>");
		score[0]=scanner.nextInt();
		System.out.println("영어점수>>");
		score[1]=scanner.nextInt();
		System.out.println("수학점수>>");
		score[2]=scanner.nextInt();
		
	
	}

	public static void main(String[] args) {
		
		int[] score=new int[3];
		int kor=0;
		int eng=0;
		int math=0;
		
		//점수 출력
		stuInput(kor, eng, math, score);
		
		System.out.printf("국어:%d,영어:%d,수학:%d",score[0],score[1],score[2]);
		
		
		
//		//객체선언
//		MainMethod m = new MainMethod();
//		//주소값 매개변수 전달하면 값이 변경됨.
//		Stuscore[] stuArr = new Stuscore[10];
//		m.stuInput(stuArr);
//		m.stuOutput(stuArr);
		
	}

}
