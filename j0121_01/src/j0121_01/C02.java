package j0121_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//예제)
		//6-500워
		//56-1000원
		//456-10000원
		//3456-10만원
		//23456-100만원
		//123456-1000만원
		
		//6자리를 랜덤으로 추출해 복권번호 생성
		//100000~199999
		//100000+(0~99999 랜덤번호)
		
		int rdm = (int)(Math.random()*10e4);
		String lotto = String.format("%06d", rdm);//String.format
		System.out.println(lotto);
		
//		int rdm = (int)(Math.random()*10e4);
//		System.out.println(100000+rdm);
		
		// 입력번호와 맞춰보기
		char a1 = lotto.charAt(5);
		char a2 = lotto.charAt(4);
		char a3 = lotto.charAt(3);
		char a4 = lotto.charAt(2);
		char a5 = lotto.charAt(1);
		char a6 = lotto.charAt(0);
		System.out.print("번호입력>>");
		String input = scanner.next();
		char b1 = input.charAt(5);
		char b2 = input.charAt(4);
		char b3 = input.charAt(3);
		char b4 = input.charAt(2);
		char b5 = input.charAt(1);
		char b6 = input.charAt(0);
		if(a1==b1) {
			if(a2==b2) {
				if(a3==b3) {
					if(a4==b4) {
						if(a5==b5) {
							if(a6==b6) {
								System.out.println("1000만원 당첨");
							}
							else System.out.println("100만원 당첨");
						}
						else System.out.println("10만원 당첨");
					}
					else System.out.println("만원 당첨");
				}
				else System.out.println("1000원 당첨");
			}
			else System.out.println("500원 당첨");
		}else {
			System.out.println("까비");
		}
		
		
		
		
//		String[] binary = {
//				"0000","0001","0010","0011",//0,1,2,3
//				"0100","0101","0110","0111",//4,5,6,7
//				"1000","1001"				//8,9
//		};
//		
//		
//		// 숫자 1개를 입력받아, 2진수를 출력.
//		System.out.println("숫자를 입력>>");
//		int input = scanner.nextInt();
//		String input = scanner.next();
//		System.out.println(binary[input.charAt(0)-'0']);
//		System.out.println(binary[Integer.parseInt(input)]);
		
		
		
		// 1987->0001 1001 1000 0111
//		System.out.println("숫자를 입력>>");
//		String input = scanner.next();
//		
//		for(int i=0;i<input.length();i++) {
//			System.out.println(binary[input.charAt(i)-'0']);
//		}
		
//		// 숫자타입->문자열타입
//		System.out.println(""+7+7.7);
//		
//		// 문자열타입->int타입,double타입
//		int a = Integer.parseInt("77");
//		double b = Double.parseDouble("77.7");
//		System.out.println(a);
//		System.out.println(b);
//		
//		// char숫자타입->int타입
//		System.out.println('9'-'0');
//		
//		// int타입->char타입
//		System.out.println((char)(9+'0'));
		
	}

}
