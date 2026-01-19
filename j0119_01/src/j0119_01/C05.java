package j0119_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("음료선택");
//		System.out.println("1.아메리카노");
//		System.out.println("2.바닐라라떼");
//		System.out.println("3.아이스티");
//		System.out.println("원하는 음료를 고르시오>>");
//		int input = scanner.nextInt();
//		
//		switch(input) {
//		case 1:
//			System.out.println("아메리카노 선택");
//			//2분
//			break;
//		case 2:
//			System.out.println("바닐라라떼 선택");
//			//3분
//			break;
//		case 3:
//			System.out.println("아이스티 선택");
//			//1분30초
//			break;
//		}
		
		
		
		
//		//98이상 A++, 97~94 A, 93 A-
//		//88이상 B++, 87~84 B, 83 B-
//		//78이상 C++, 77~74 C, 73 C-
//		//68이상 D++, 67~64 D, 63 D-
//		//60미만 F
//		int input = scanner.nextInt();
//		if (input >= 90) {
//			if (input>=98) System.out.println("A+");
//			else if (input<=93) System.out.println("A-");
//			else System.out.println("A");
//		}else if (input >=80) {
//			if (input>=88) System.out.println("B+");
//			else if (input<=83) System.out.println("B-");
//			else System.out.println("B");
//		}else if (input >=70) {
//			if (input>=78) System.out.println("C+");
//			else if (input<=73) System.out.println("C-");
//			else System.out.println("C");
//		}else if (input >=60) {
//			if (input>=68) System.out.println("D+");
//			else if (input<=63) System.out.println("D-");
//			else System.out.println("D");
//		}else System.out.println("F");
//		
//		scanner.close();
		
		int cnt = 0;
		// 19854 -> 7
		System.out.println("숫자 입력>>");
		String num = scanner.next();
		
		if (num.charAt(0)=='7') cnt++;
		if(num.charAt(1)=='7') cnt++;
		if(num.charAt(2)=='7') cnt++;
		if(num.charAt(3)=='7') cnt++;
		if(num.charAt(4)=='7') cnt++;
		System.out.println("7의 개수:"+cnt);
		
		scanner.close();
		
//		int input = scanner.nextInt();
//		// 수(90)우(80)미(70)양(60)가(60미만)
//		if(input>=90) {
//			System.out.println("수");
//		}else if(input>=80) {
//			System.out.println("우");
//		}else if(input>=70) {
//			System.out.println("미");
//		}else if(input>=60) {
//			System.out.println("양");
//		}else {
//			System.out.println("가");
//		};
		
		
//		// 양수, 0, 음수
//		if (input>0) {
//			System.out.println("양수");
//		}else if(input==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("음수");
//		}
		
		
//		if(input>=60) {
//			System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}


	}

}
