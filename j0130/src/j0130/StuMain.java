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
			case 1://성적입력
				s.stu_input();
				break;
			
			case 2://성적출력
				s.stu_output();
				break;
			
			case 3://성적수정
				s.stu_update();
				break;
			
			case 4://성적삭제
				s.stu_delete();
				break;
			
			case 5://성적검색
				s.stu_search();
				break;
			
			case 6://성적정렬
				s.stu_sort();
				s.stu_output();
				break;
			
			case 8://파일불러오기
				s.fileOpen();
				break;
			
			case 9://파일저장하기
				s.fileSave();
				break;
			case 0:
				System.out.println("<<프로그램을 종료합니다>>");
				break loop;
			}
		}

	}//main

}
