package j0121_01;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		// 성적입력 프로그램
		// 0.변수선언
		Scanner scanner = new Scanner(System.in);
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] no = new int[10];
		int count = 0, total = 0;
		
		// 1.메뉴
		loop:while (true) {
			System.out.println("[성적입력 프로그램]");
			System.out.println("-------------------------");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.성적검색");
			System.out.println("0.작업종료");
			System.out.println("-------------------------");
			System.out.println("메뉴선택>>");
			int choice = scanner.nextInt();
			System.out.println();
			
			switch (choice) {
			
			case 1:// 2.성적입력
				System.out.println("<1.성적입력>");
				while (true) {
					System.out.println("-------------------------");
					System.out.printf("%d번 학생이름>> \n",(count+1));
					name[count] = scanner.next();
					
					if(name[count].equals("0")) break;
					
					total = 0;
					for(int i=0;i<3;i++) {
						System.out.printf("%s 점수입력>> \n",title[i+2]);
						score[count][i] = scanner.nextInt();
						total = score[count][i];
					}
					score[count][3] = total;
					avg[count]=total/3.;
					no[count]=count+1;
					count++;
					
					System.out.println("<성적입력완료>");
				}
				break;
				
			case 2://성적출력
				System.out.println("<2.성적출력>");
				System.out.println("--------------------------------------------------");
				for(int i=0;i<title.length;i++) System.out.print(title[i]+"\t");
				System.out.println();
				System.out.println("--------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[0].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%.2f\n",avg[i]);
					System.out.println();
				}
				break;
				
			case 3:
				
				break;
				
			case 4://학생검색
				System.out.println("<학생검색>");
				System.out.println("-------------------------");
				System.out.println("검색할 학생>>");
				String search = scanner.next();
				int temp = 0;
				for(int i=0;i<title.length;i++) System.out.print(title[i]+"\t");
				System.out.println();
				System.out.println("--------------------------------------------------");
				for(int i=0;i<count;i++) {
					if(name[i].contains(search)) {
						temp = 1;
						System.out.printf("%d\t",no[i]);
						System.out.printf("%s\t",name[i]);
						for(int j=0;j<score[0].length;j++) {
							System.out.printf("%d\t",score[i][j]);
						}
						System.out.printf("%.2f\n",avg[i]);
						System.out.println();
					}
						
				}
				if(temp==0) System.out.println("검색결과가 없습니다.");
				System.out.println("--------------------------------------------------");
				break;
				
			default:
				System.out.println("<<프로그램 종료>>");
				break loop;
			}
			
		}
		scanner.close();
		
	}

}
