package j0130;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while (true) {
			s.screen();
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				s.stu_input();
				break;
			
			case 2:
				s.stu_output();
				break;
			
			case 3:
				
				break;
			
			case 4:
				s.stu_delete();
				break;
			
			case 5:
				
				break;
			
			case 6:
				
				break;
			
			case 8:
				s.fileOpen();
				break;
			
			case 9:
				
				break;
			case 0:
				System.out.println("<<프로그램을 종료합니다>>");
				break loop;
			}
		}

	}//main

}
