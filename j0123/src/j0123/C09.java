package j0123;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		Stu[] s = new Stu[10];
		int choice=0;
		int kor=0,eng=0,math=0;
		String name="";
		
		loop:while (true) {
			System.out.println("[성적프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.명단출력");
			System.out.println("3.성적검색");
			System.out.println("4.성적수정");
			System.out.println("0.프로그램종료");
			System.out.print("메뉴선택>>");
			choice=scanner.nextInt();
			System.out.println();
			
			switch (choice) {
			case 1:
				System.out.println("<1.성적입력>");
				while (true) {
					System.out.printf("%d번 이름 입력(0.메인으로)>>\n",(Stu.count+1));
					name=scanner.next();
					if(name.equals("0")) break;
					System.out.printf("%s 점수입력>>\n",title[2]);
					kor=scanner.nextInt();
					System.out.printf("%s 점수입력>>\n",title[3]);
					eng=scanner.nextInt();
					System.out.printf("%s 점수입력>>\n",title[4]);
					math=scanner.nextInt();
					s[Stu.count] = new Stu(name, kor, eng, math);
				}
				break;
			case 2:
				System.out.println("<2.명단출력>");
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				for(int i=0;i<Stu.count;i++) {
					System.out.printf(
							"%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
							s[i].no,s[i].name,s[i].kor,s[i].eng,
							s[i].math,s[i].total,s[i].avg
							);
				}
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 0:
				System.out.println("종료합니다.");
				break loop;
			
		}

		
		}

	}

}
