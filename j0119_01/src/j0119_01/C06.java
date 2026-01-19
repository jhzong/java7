package j0119_01;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//charAt()위치값요소,contains():존재유무,indexOf():위치값
		int count = 0;
		String num = "9789057899979971234567";
		
		// indexOf()와 for문을 사용해
		// 7이 있는 위치, 7이 총 몇개 사용됐는지 출력
		
		System.out.println(num.indexOf("7",11));
		

		
		
//		String num = "1234567";
//		입력받은 숫자 중 7이 있는 확인
//		System.out.println(num.indexOf("8"));

//		//예제)랜덤숫자 1개 생성(0~9). 입력받은 7개중 랜덤숫자열과 똑같은 숫자가 몇개인지 출력.
//		int rnum=(int)(Math.random()*10);
//		char r = (char)(rnum+'0');
//		
//		//int숫자타입을 char숫자타입으로 바꾸는 법
//		//(char)(1+'0')=>(char)(1+48)=>(char)(49)=>문자'1'
//		//char숫자타입을 int숫자타입으로 변경방법
//		//'7'-'0'=>int타입 7
//		System.out.println("숫자를 입력>>");
//		String input = scanner.next();
//		
//		int count = 0;
//		for(int i=0;i<input.length();i++) {
//			if(input.charAt(i)==r) count++;
//		}
//		System.out.println("랜덤 숫자:"+r);
//		System.out.println("입력 숫자:"+input);
//		System.out.println("랜덤 숫자 같은 숫자의 개수:"+count);
		
		//예제) 입력받은 숫자5개 중 7이 몇개인지 출력.
//		System.out.println("숫자 입력>>");
//		String input = scanner.next();
//		
//		int count = 0;
//		for(int i=0;i<input.length();i++) {
//			if(input.charAt(i)=='7') count++;
//		}
//		
//		System.out.println("입력값:"+input);
//		System.out.println("결과값:"+count);

		
//		//랜덤숫자 5개 추출, 7이 몇개인지 출력
//		int count = 0;
//		String random_num = "";
//		
//		for(int i=0;i<5;i++) {
//			int rnum = (int)(Math.random()*10);
//			random_num += rnum;
//			if (rnum==7) count++;
//		}
//		
//		System.out.println("출력숫자:"+random_num);
//		System.out.println("7의 개수:"+count);
		
//		int sum = 0;
//		int i = 0;
//		for (int i=1;i<=10;i++) {
//			sum+=i;
//			System.out.println(i+","+sum);
//		}
		
		
//		//예제)1~100까지 홀수의 합이 100을 넘는 시점의 i와 sum을 출력.
//		int sum = 0;
//		
//		for (int i=1;i<=100;i++) {
//			if (i%2==1) {
//				sum += i;
//				if(sum>100) {
//					break;
//				}
//				System.out.println(i+","+sum);
//			}
//		}
		
//		//예제)1~100까지 홀수의 합
//		int sum = 0;
//		
//		for (int i=1;i<=100;i++) {
//			if (i%2==1) {
//				sum += i;
//			}
//			System.out.println(i+","+sum);
//		}
		
//		//예제)1~100까지 합
//		int sum = 0;
//		
//		for (int i=1;i<=100;i++) {
//			sum += i;
//			System.out.println(i+","+sum);
//		}
		
		
		
		
//		int sum = 0;
//		
//		for(int i=1;i<10;i++) {
//			sum += i;
//			System.out.println(i+","+sum);
//			
//		}
		
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(i);
//		}
		
//		//연습)로또
//		int lotto1 = (int)(Math.random()*45)+1;
//		int lotto2 = (int)(Math.random()*45)+1;
//		int lotto3 = (int)(Math.random()*45)+1;
//		int lotto4 = (int)(Math.random()*45)+1;
//		int lotto5 = (int)(Math.random()*45)+1;
//		System.out.println("로또번호");
//		System.out.printf("%d %d %d %d %d",lotto1,lotto2,lotto3,lotto4,lotto5);
		
		
//		//0~9
//		int r_num1 = (int)(Math.random()*10);
//		int r_num2 = (int)(Math.random()*10);
//		int r_num3 = (int)(Math.random()*10);
//		int r_num4 = (int)(Math.random()*10);
//		int r_num5 = (int)(Math.random()*10);
//		System.out.printf("%d%d%d%d%d",r_num1,r_num2,r_num3,r_num4,r_num5);

		
//		//0~9
//		int r_num = (int)(Math.random()*10);
//		System.out.println(r_num);
//		//0~99
//		int r_num2 = (int)(Math.random()*100);
//		System.out.println(r_num2);
//		//0~49
//		int r_num3 = (int)(Math.random()*50);
//		System.out.println(r_num3);
		
//		// 1~10까지 랜덤 숫자 생성
//		int random_num = (int)(Math.random()*10)+1;
//		System.out.println(random_num);
//		// 1~100까지 랜덤 숫자 생성
//		int random_num = (int)(Math.random()*100)+1;
//		System.out.println(random_num);
//		// 1~50까지 랜덤 숫자 생성
//		int random_num = (int)(Math.random()*50)+1;
//		System.out.println(random_num);

	}

}
