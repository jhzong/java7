package j0129_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	ArrayList<Stuscore> list = new ArrayList<Stuscore>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	Scanner scanner = new Scanner(System.in);
	String name;
	int no,kor,eng,math,total;
	double avg;
	
	public StuDeck() {
		list.add(new Stuscore("홍길동", 100, 100, 99));
		list.add(new Stuscore("유관순", 90, 90, 95));
		list.add(new Stuscore("이순신", 80, 80, 81));
	}
	
	// 0. 메인메뉴
	void main_menu() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("0.프로그램종료");
		System.out.println("----------------------");
		System.out.println("메뉴선택>>");
	}
	
	// 1. 성적입력
	void stu_input() {
		System.out.println("<1.성적입력>");
		System.out.println((Stuscore.count+1)+"번 학생이름>>");
		name = scanner.next();
		System.out.println("국어성적>>");
		kor = scanner.nextInt();
		System.out.println("영어성적>>");
		eng = scanner.nextInt();
		System.out.println("수학성적>>");
		math = scanner.nextInt();
		list.add(new Stuscore(name,kor,eng,math));
		
		System.out.println(name+" 학생 성적추가");
		System.out.println();
	}
	
	// 2. 성적명단
	void stu_list() {
		System.out.println("<2.성적명단>");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("---------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.println(s);
		}
	}

}
