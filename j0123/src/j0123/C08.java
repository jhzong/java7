package j0123;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		String name="";
		int kor=0,eng=0,math=0;
		int choice=0;
		
		
		System.out.println("성적프로그램");
		System.out.println("1.성적입력");
		System.out.println("---------------------");
		System.out.println("작업선택>>");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			while (true) {
				System.out.println("이름입력(0.이전으로)>>");
				name=scanner.next();
				if(name.equals("0")) break;//while종료
				System.out.println("국어점수입력>>");
				kor=scanner.nextInt();
				System.out.println("영어점수입력>>");
				eng=scanner.nextInt();
				System.out.println("수학점수입력>>");
				math=scanner.nextInt();
				s[Stuscore.count] = new Stuscore(name, kor, eng, math);
				System.out.println();
				
			}
			for(int i=0;i<Stuscore.count;i++) {
				System.out.printf(
						"%d,%s,%d,%d,%d,%d,%.2f\n",
						s[i].no,s[i].name,s[i].kor,s[i].eng,
						s[i].math,s[i].total,s[i].avg
						);
			}
			break;

		}//switch
		System.out.println("프로그램종료");
	}

}
