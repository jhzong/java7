package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {
	
	static int aa;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1~10
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		System.out.println("순차번호:"+Arrays.toString(num));
		//랜덤 섞기
		for(int i=0;i<300;i++) {
			int no=(int)(Math.random()*10);//0~9
			int temp = num[0];
			num[0]=num[no];
			num[no]=temp;
		}
		System.out.println("랜덤번호:"+Arrays.toString(num));
		
		
		
		
		
//		int[] num = new int[3];
//		int a=0;
//		int a2=0;
//		int a3=0;
//		// (1~3)랜덤숫자를 변수에 가가 다른 숫자를 입력해 출력 
//		
//		// 배열을 사용해 각각 다른 숫자를 입력해 출력
//		num[0]=(int)(Math.random()*3)+1;
//		int i = 1;
//		loop:while(true) {
//			num[i] = (int)(Math.random()*3)+1;
//			if(num[i-1]!=num[i]) {
//				i++;
//				while(true) {
//					num[i] = (int)(Math.random()*3)+1;
//					if(num[i-1]!=num[i] && num[i-2]!=num[i]) {
//						break loop;
//					}
//				}
//			}
//		}
//		System.out.println("[랜덤번호]");
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]+"");
//		}
		
//		while(true) {
//			a2=(int)(Math.random()*3)+1;
//			a3=(int)(Math.random()*3)+1;
//			if(a!=a2 && a!=a3 && a2!=a3) {
//				break;
//			}
//		}
		
		
		
		// 예제)3명의 이름, 국어 입력받아 출력
//		String[] name = new String[3];
//		int[] kor = new int[3];
//		for(int i=0;i<name.length;i++) {
//			System.out.println("이름을 입력>>");
//			name[i] = scanner.next();
//			System.out.println("국어점수 입력>>");
//			kor[i] = scanner.nextInt();
//		}
//		for(int i=0;i<name.length;i++) {
//			System.out.printf("%s\t%d\n",name[i],kor[i]);
//		}
		
		
		
		
		
		// 예제)(1~10)랜덤으로 숫자 5개 생성. 배열에 저장. 출력
		// 예제)입력 숫자 5개 생성. 배열에 저장. 출력
//		int[] num = new int[5];
//		int[] input = new int[5];
//		for(int i=0;i<input.length;i++) {
//			int a = (int)(Math.random()*10)+1;
//			System.out.println("숫자를 입력>>");
//			int b = scanner.nextInt();
//			num[i]=a;
//			input[i]=b;
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.printf("%d\t",num[i]);
//		}
//		System.out.println();
//		for(int i=0;i<input.length;i++) {
//			System.out.printf("%d\t",input[i]);
//		}
//		System.out.println();
		
		
		
//		int[] a = new int[3];
//		a[0]=1;
//		a[1]=1.1;
//		a[2]="홍길동";
//		for(int i=0;i<3;i++) {
//			System.out.println("숫자를 입력>>");
//			a[i] = scanner.nextInt();
//		}
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(a[i]+" ");
//		}
		
		
		//숫자 3개를 입력받아 출력
//		System.out.println("숫자를 입력>>");
//		int a = scanner.nextInt();
//		System.out.println("숫자를 입력>>");
//		int a2 = scanner.nextInt();
//		System.out.println("숫자를 입력>>");
//		int a3 = scanner.nextInt();
//		
//		System.out.printf("%d,%d,%d \n",a,a2,a3);
		
//		int[] score = new int[5];
//		for(int i=0;i<5;i++) {
//			score[i]=i+1;
//			System.out.println(score[i]);
//		}
		
		
		//배열의 값을 입력하는 방법
//		//(1)
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//		
//		//(2)★
//		int[] num = {1,2,3,4,5};
//		
//		//(3)
//		int[] num2 =new int[] {1,2,3,4,5};
		
		
		
		
		
		
		
		
		
		
		// 배열=>같은 '타입'의 여러 변수의 묶음.
		// 매소드 내의 변수들은 초기화를 해야 실행 가능
//		int a;// 메소드내 자동 초기화X
////		System.out.println(a);
//		System.out.println(aa);
//		
//		int[] score = new int[5];// 배열은 자동 초기화
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
//		System.out.println(score);

	}

}
