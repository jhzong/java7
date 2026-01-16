package j0116_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// String 문자열 type : next()-띄어쓰기X/enterX, nextline()-띄어쓰기O/enterO
		// 정수 type : nextInt(), nextLong()
		// 실수 type : nextFloat(), nextDouble()
		Scanner scanner = new Scanner(System.in);
		// 이름,국어,영어,수학 입력받아 출력
		System.out.println("이름 입력>>");
		String name = scanner.next();
		System.out.println("국어 입력>>");
		int kor = scanner.nextInt();
		System.out.println("영어 입력>>");
		int eng = scanner.nextInt();
		System.out.println("수학 입력>>");
		int math = scanner.nextInt();
		System.out.printf("이름:%s,국어:%d,영어:%d,수학:%d",name,kor,eng,math);
		
		
		
		
		/*
		 * System.out.println("이름을 입력하시오>>"); String name = scanner.next();
		 * System.out.println("국어 점수를 입력하시오>>"); int kor = scanner.nextInt();
		 * 
		 * System.out.println("이름 : "+name+" 국어점수 : "+kor);
		 */
		/*
		 * System.out.println("이름을 입력하시오>>"); String name = scanner.nextLine();
		 * System.out.println("아이디를 입력하세요>>"); String id = scanner.nextLine();
		 * System.out.println("이름 : "+name); System.out.println("아이디 : "+id);
		 */
	}

}
