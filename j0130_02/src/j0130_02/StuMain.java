package j0130_02;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		StuDeck s = new StuDeck();
		Scanner scanner = new Scanner(System.in);
		
		loop:while (true) {
			System.out.println("[성적입력프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.성적삭제");
			System.out.println("5.성적검색");
			System.out.println("6.성적정렬");
			System.out.println("8.파일물려오기");
			System.out.println("9.파일저장하기");
			System.out.println("0.프로그램종료");
			System.out.println("------------------------------");
			System.out.println("메뉴선택>>");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				
				break;
				
			case 0:
				System.out.println("<프로그램종료>");
				break loop;
				
			}
			
		}

	}

}
