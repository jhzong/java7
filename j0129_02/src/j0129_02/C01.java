package j0129_02;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while (true) {
			s.main_menu();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				s.stu_input();
				break;

			case 2:
				s.stu_list();
				break;
				
			case 0:
				System.out.println("<프로그램종료>");
				break loop;
			}
			
		}

	}

}
