package j0129;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck {
	
	public StuDeck() {
		list.add(new Stuscore("홍길동", 100, 100, 99));
		list.add(new Stuscore("유관순", 90, 90, 95));
		list.add(new Stuscore("이순신", 80, 80, 81));
	}
	// 객체컬렉션 - 객체를 담는 배열
	// add, get, remove, size(), isEmpty()
	ArrayList<Stuscore> list = new ArrayList<Stuscore>();
	Scanner scan = new Scanner(System.in);
	String name,search;
	int no,kor,eng,math,total,temp,choice;
	double avg;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 3.성적수정
	void stu_edit() {
		
	}
	
	// 4.성적삭제
	void stu_delete() {
		System.out.println("삭제할 학생성적>>");
		search = scan.next();
		temp = 0;
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			if(s.getName().equals(search)) {
				temp = 1;
				System.out.println(search+" 학생의 성적을 삭제합니까?(1.Y/2.N)");
				choice = scan.nextInt();
				if(choice==1) {
					list.remove(i);
					System.out.println("삭제완료.");
					break;
				}else {
					System.out.println("삭제가 취소됩니다.");
					break;
				}
			}
		}//for
		
		if(temp==0) {
			System.out.println("검색결과 없음.");
		}
	}
	
	// 2.성적출력
//	Iterator<Stuscore> it = list.iterator();
//	while(it.hasNext()) {
//		Stuscore s = it.next();
//		
//	}
	
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],
				title[5],title[6]);
		System.out.println("-----------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.println(s);
		}//for
	}
	
	// 1.성적입력
	void stu_input() {
		System.out.println((Stuscore.count+1)+"번 학생이름>>");
		name = scan.next();
		System.out.println("국어점수>>");
		kor = scan.nextInt();
		System.out.println("영어이름>>");
		eng = scan.nextInt();
		System.out.println("수학이름>>");
		math = scan.nextInt();
		// 번호,합계,평균 자동입력
		list.add(new Stuscore(name,kor,eng,math));
		
		System.out.println(name+" 성적추가완료");
		System.out.println();
	}
	
	// 0.화면출력
	void screen_print() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.성적삭제");
		System.out.println("5.성적검색");
		System.out.println("-------------------------");
		System.out.println("수행작업>>");
	}

}
