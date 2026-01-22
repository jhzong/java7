package j0122;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = {1,2,3,0,0,0,0,0,0,0};
		String[] name = {"홍길동","유관순","이순신","","","","","",""};
		int[][] score = {
				{100,100,100,300},{90,90,90,270},{80,80,80,240},
				{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},
				{0,0,0,0},{0,0,0,0},{0,0,0,0}
		};
		double[] avg = {100.0,90.0,80.0,0,0,0,0,0,0,0};
		int count = 3, temp = 0, choice = 0;
		String search = "";
		
		loop:while (true) {
			// 메인메뉴
			System.out.println("[ 성적입력 프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1.성적입력");
			System.out.println("2.명단출력");
			System.out.println("3.성적수정");
			System.out.println("4.성적검색");
			System.out.println("0.작업종료");
			System.out.println("-------------------------");
			System.out.println("메뉴선택>>");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1://입력
				System.out.println("[ 성적입력 ]");
				System.out.println("-------------------------");
				int total = 0;
				System.out.printf("%d번 학생 이름(0.이전페이지)>>\n",count+1);//이름
				name[count] = scanner.next();
				if(name[count].equals("0")) {
					System.out.println("이전페이지로 이동");
					break;
				}
				for(int i=0;i<3;i++) {//국,영,수 입력
					System.out.printf("%s 점수 입력>>\n",title[i+2]);
					score[count][i] = scanner.nextInt();
					total += score[count][i];
				}
				score[count][3] = total;//합계
				avg[count] = total/3.0;//평균
				System.out.printf("%s 학생성적 저장\n",name[count]);
				System.out.println();
				break;
				
			case 2://출력
				System.out.println("[ 리스트출력 ]");
				for(int i=0;i<title.length;i++) System.out.print(title[i]+"\t");
				System.out.println();
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[0].length;j++) System.out.printf("%d\t",score[i][j]);
					System.out.printf("%.1f\n",avg[i]);
				}
				System.out.println();
				break;
				
			case 3://수정
				System.out.println("수정할 학생이름>>");//수정할 학생검색
				search = scanner.next();
				temp = 0;
				for(int i=0;i<count;i++) {
					//검색확인
					if(name[i].equals(search)) {
						System.out.printf("[ %s 성적수정 ]\n",search);
						System.out.println("-------------------------");
						System.out.println("1.국어점수 수정");
						System.out.println("2.영어점수 수정");
						System.out.println("3.수학점수 수정");
						System.out.println("-------------------------");
						System.out.println("수정할 과목>>");
						choice = scanner.nextInt();
						System.out.println();
						
						// ※국,영,수 점수 수정※
						System.out.printf("[%s점수 수정]\n",title[choice+1]);
						System.out.printf("현재%s점수:%d\n",title[choice+1],score[i][choice-1]);
						System.out.printf("변경%s점수>>",title[choice+1]);
						score[i][choice-1] = scanner.nextInt();
						
						// 합계,평균 수정
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3]/3.0;
						temp = 1;
						
						System.out.printf("%s %s점수 %d점으로 수정완료.\n\n",search,title[choice+1],score[i][choice-1]);
					}//if
				}//for
				if(temp==0) System.out.printf("검색결과없음(%s)\n\n",search);
				break;
				
			case 4://검색
				System.out.println("검색할 학생이름>>");
				search = scanner.next();
				temp = 0;
				//검색출력
				for(int i=0;i<title.length;i++) System.out.print(title[i]+"\t");
				System.out.println();
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {
					//검색확인
					if(name[i].contains(search)) {
						System.out.printf("%d\t",no[i]);
						System.out.printf("%s\t",name[i]);
						for(int j=0;j<score[0].length;j++) System.out.printf("%d\t",score[i][j]);
						System.out.printf("%.1f\n",avg[i]);
						System.out.println();
						temp = 1;
					}//if
				}
				if(temp==0) System.out.printf("검색결과없음(%s)\n",search);
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
			
		}//while
		scanner.close();
	}//main

}//class
