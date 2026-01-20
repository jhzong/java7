package j0120_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		
		int no = 10;
		String name= "홍길동";
		int num = 100;
		String a = String.format("번호:%d, 이름:%s, 국어:%d \n",no, name, num);
		System.out.println(a);
//		String b = System.out.println("");
		
//		int num = 100;
//		System.out.printf("%10d \n",num);
//		System.out.printf("%010d \n",num);
		
		
//		int i = 10;
//		String name = "홍길동";
//		double avg = 99.6799999;
//		//번호:10, 이름:홍길동, 평균:99.67
//		System.out.printf("번호:%d, 이름:%s, 평균:%.2f",i,name,avg);

		// 조건문 - if, switch
		// 반복문 - for,while
		
//		int i = 0;
//		int sum = 0;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum+=i;
//			i++;
//		}
//		System.out.println("i-1의 값:"+(i-1));
//		System.out.printf("%d-1의 값:%d \n",i,sum-i);
//		
//		System.out.println("i의 값:"+i);
//		System.out.println("sum의 값:"+sum);
//		for(;;) {
//			break;
//		}
		
		
		
		
		//반복문 이름 지정 가능
//		loop:while(true) {
//			while(i<10) {
//				if(i==0) {
//					break loop;//반복문을 종료
//				}
//			}
//		}
//		
//		loop2:for(int i=0;i<9;i++) {}
		
		//예제)1~100까지 랜덤 숫자 생성
		//while문/for문을 이용해 스무고개(10번) 만들기
		
		//보기)1번째 시도
		//보기)입력한 수보다 큽니다./입력한 수보다 작아요./정답입니다.
//		int rdm_num = (int)(Math.random()*100)+1;
//		Scanner scanner = new Scanner(System.in);
//		//for
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하시오>>");
//			int input = scanner.nextInt();
//			
//			if(input>rdm_num) {
//				System.out.println("입력한 수보다 작아요.");
//			}else if(input<rdm_num) {
//				System.out.println("입력한 수보다 큽니다.");
//			}else {
//				System.out.println("정답입니다.");
//				break;
//			}
//			System.out.println("나의 숫자 : "+input);
//		}
//		System.out.println("랜덤 숫자 : "+rdm_num);
//		
//		
//		//while
//		int i=0;
//		while(i<10) {
//			
//		}
//		
//		scanner.close();

		
		//예제)입력을 2개 받아 구구단 출력
		//보기)3,7->3단에서 7단까지 출력
		//Math.min/max
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("2~9>>");
//		int input1 = scanner.nextInt();
//		System.out.println("2~9>>");
//		int input2 = scanner.nextInt();
//		int num1 = Math.min(input1, input2)
//		int num2 = Math.max(input1, input2)
//	
//		for(int i=num1;i<=num2;i++) {
//			System.out.printf("[ %d단 ] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//			}
		
		//if
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("2~9>>");
//		int input1 = scanner.nextInt();
//		System.out.println("2~9>>");
//		int input2 = scanner.nextInt();
//		
//		if (input1<input2) {
//			for(int i=input1;i<=input2;i++) {
//				System.out.printf("[ %d단 ] \n",i);
//				for(int j=1;j<=9;j++) {
//					System.out.printf("%d X %d = %d \n",i,j,i*j);
//				}
//			}
//		}else {
//			for(int i=input2;i<=input1;i++) {
//				System.out.printf("%d단 \n",i);
//				for(int j=1;j<=9;j++) {
//					System.out.printf("%d X %d = %d \n",i,j,i*j);
//				}
//			}
//		}
		
		
		
		
		// while문 0을 포함한 3자리표현
//		int i = 0;
//		while(i<=9) {
//			int j = 0;//한사이클 돌고 j 초기화
//			while(j<=9) {
//				int k = 0;//한사이클 돌고 k 초기화
//				while(k<=9) {
//					System.out.printf("%d%d%d\n",i,j,k);
//					k++;
//				}
//				j++;
//			}
//			i++;
//		}
		
		// for문 0을 포함한 3자리표현
//		for(int i=0;i<=9;i++) {
//			for(int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++) {
//					System.out.printf("%d%d%d\n",i,j,k);
//				}
//			}
//		}
	
		
		
		
		
		
		// 중첩for문
		// 구구단 세로로 줄바꿈 출력
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ] \t\t",i);
//		}
//		System.out.println();
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d X %d = %d\t",j,i,i*j);
//			}
//			System.out.println();
//		}
//		
		
		
		// 구구단 짝수만
//		for(int i=2;i<9;i++) {
//			if (i%2==0) {
//				System.out.printf("%d단 \n",i);
//				for(int j=1;j<9;j++) {
//					System.out.printf("%d X %d = %d \t",i,j,i*j);
//				}
//				System.out.println();
//			}
//		}
		
		
		// 구구단
//		for(int i=2;i<9;i++) {
//			System.out.printf("%d단 \n",i);
//			for(int j=1;j<9;j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//			}
//		}

	}

}
