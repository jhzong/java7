package j0130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StuDeck {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Stuscore> list = new ArrayList();
	int no,kor,eng,math,total,choice,temp;
	String name;
	double avg;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	String filePath = "c:/aaa/stu.txt";
	
	// 0.메인메뉴
	void screen() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.성적삭제");
		System.out.println("5.성적검색");
		System.out.println("6.성적정렬");
		System.out.println("8.파일불러오기");
		System.out.println("9.파일저장하기");
		System.out.println("0.프로그램종료");
		System.out.println("------------------------");
		System.out.print("메뉴선택>>");
	}//screen()
	
	// 1.성적입력
	void stu_input() {
		System.out.println("[성적입력]");
		System.out.print((Stuscore.count+1)+"번 학생이름(0.이전페이지)>>");
		name = scanner.next();
		if (name.equals("0")) return;
		System.out.println("국어점수>>");
		kor = scanner.nextInt();
		System.out.println("영어점수>>");
		eng = scanner.nextInt();
		System.out.println("수학점수>>");
		math = scanner.nextInt();
		list.add(new Stuscore(name, kor, eng, math));
		System.out.println(name+"학생 성적저장완료");
		
	}//stu_input()
	
	// 2-1.성적명단출력
	void stu_output() {
		System.out.println("[학생성적명단]");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s.getNo(),s.getName(),s.getKor(),s.getEng(),
				s.getMath(),s.getTotal(),s.getAvg());
		}//for
		System.out.println();
	}//stu_output()

	// 2-2.성적명단출력(매개변수가 있는 메소드)
	void stu_output(List<Stuscore> slist) {
		System.out.println("[학생성적명단]");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0;i<slist.size();i++) {
			Stuscore s = slist.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg());
		}//for
		System.out.println();
	}//stu_output(List<Stuscore> slist)
	
	// 5.성적수정
	void stu_update() {
		System.out.println("검색할 이름>>");
		name = scanner.next();
		if(name.equals("0")) return;
		temp=0;
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			if(s.getName().equals(name)) {
				temp=1;
				System.out.println(name+"학생을 찾았습니다.");
				System.out.println("1.국어점수:"+s.getKor());
				System.out.println("2.영어점수:"+s.getEng());
				System.out.println("3.수학점수:"+s.getMath());
				System.out.println("0.취소:");
				System.out.println("번호>>");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("현재국어점수:"+s.getKor());
					System.out.println("새로운 점수>>");
					int input = scanner.nextInt();
					s.setKor(input);
					s.calTotal();
					s.calAvg();
					System.out.println("국어점수를 "+input+"점으로 변경");
					break;
				
				case 2:
					System.out.println("현재영어점수:"+s.getKor());
					System.out.println("새로운 점수>>");
					int input2 = scanner.nextInt();
					s.setEng(input2);
					s.calTotal();
					s.calAvg();
					System.out.println("영어점수를 "+input2+"점으로 변경");
					break;
				
				case 3:
					System.out.println("현재수학점수:"+s.getKor());
					System.out.println("새로운 점수>>");
					int input3 = scanner.nextInt();
					s.setMath(input3);
					s.calTotal();
					s.calAvg();
					System.out.println("수학점수를 "+input3+"점으로 변경");
					break;

				default:
					System.out.println("수정취소");
					System.out.println();
					break;
				}
			}
		}
		
		if(temp==0) {//검색된 학생이 없다면
			System.out.println("검색결과없음");
			System.out.println();
		}else {//검색된 학생이 있다면
			stu_output(list);
		}
	}//stu_update()
	
	
	// 4.성적삭제
	void stu_delete() {
		System.out.println("삭제할 학생(0.이전페이지)>>");
		name = scanner.next();
		if (name.equals("0")) return;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			String search = list.get(i).getName();
			if(search.equals(name)) {
				temp = 1;
				System.out.println(name+"을(를) 삭제할까요?(1.Y/2.N)");
				choice = scanner.nextInt();
				if (choice==1) {
					list.remove(i);
					System.out.println(name+"의 성적삭제완료.");
					System.out.println();
				}
				break;
			}//if
		}//for
		if (temp==0) {
			System.out.println("검색결과없음.");
			System.out.println();
			
		}
	}//stu_delete()
	
	// 5.성적검색
	void stu_search() {
		System.out.println("[성적검색]");
		System.out.println("1.이름");
		System.out.println("2.점수");
		System.out.println("---------------------------");
		System.out.println("검색항목>>");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			temp=0;
			System.out.println("검색할 이름>>");
			String search = scanner.next();
			List<Stuscore> slist = new ArrayList();
			for(int i=0;i<list.size();i++) {
				Stuscore s = list.get(i);
				//equals:포함, contains:일치
				if(s.getName().contains(search)) {
					temp=1;
					slist.add(s);
				}
			}
			
			if(temp==0) {//검색된 학생이 없다면
				System.out.println("검색결과없음");
				System.out.println();
			}else {//검색된 학생이 있다면
				stu_output(slist);
			}
			
		}
	}
	
	// 6.성적정렬
	void stu_sort() {
		System.out.println("[성적정렬]");
		System.out.println("1.합계순정렬");
		System.out.println("2.이름순정렬");
		System.out.println("3.번호순정렬");
		System.out.println("----------------------------");
		System.out.println("정렬방식>>");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1://합계순
			list.sort(new Comparator<Stuscore>() {
				@Override
				public int compare(Stuscore o1, Stuscore o2) {
					return o2.getTotal()-o1.getTotal();
				}
			});
			break;

		case 2://이름순
			list.sort(new Comparator<Stuscore>() {
				@Override
				public int compare(Stuscore o1, Stuscore o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			
			break;
		
		case 3://번호순
			list.sort(new Comparator<Stuscore>() {
				@Override
				public int compare(Stuscore o1, Stuscore o2) {
					return o1.getNo()-o2.getNo();
				}
			});
			
			break;
		}
	}
	
	// 8.파일불러오기
	void fileOpen() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if(line==null) break;
				String[] stu = line.split(",");
				no = Integer.parseInt(stu[0]);
				name = stu[1];
				kor = Integer.parseInt(stu[2]);
				eng = Integer.parseInt(stu[3]);
				math = Integer.parseInt(stu[4]);
				total = Integer.parseInt(stu[5]);
				avg = Double.parseDouble(stu[6]);
				list.add(new Stuscore(no, name, kor, eng, math, total, avg));
			}
			System.out.println("<불러오기완료>");
			System.out.println();
			
		} catch (Exception e) {e.printStackTrace();}
	}//fileOpen()
	
	// 9.파일저장하기
	void fileSave() {
		filePath = "c:/aaa/stu.txt";
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<list.size();i++) {
				Stuscore s = list.get(i);
				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg());
				bw.write(str);
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("<저장완료>");
		System.out.println();
	}

	
}//class
