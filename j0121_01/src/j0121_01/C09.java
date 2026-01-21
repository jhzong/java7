package j0121_01;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int total = 0, count = 0;
		
		loop:while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.성적검색");
			System.out.println("0.종료");
			System.out.println("--------------");
			System.out.println("원하는 작업 선택>>");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1://입력
				while (true) {
					total = 0;//초기화
					System.out.println("[성적입력]");
					System.out.printf("%d번 학생 이름입력(0.이전페이지)>>",count+1);
					name[count] = scanner.next();
					
					if(name[count].equals("0")) break;
					
					for(int i=0;i<3;i++) {
						System.out.printf("%s 점수입력>>",title[i+2]);
						score[count][i] = scanner.nextInt();
						total += score[count][i];
					}
					score[count][3] = total;//합계
					avg[count] = total/3.0;//평균
					no[count]=count+1;
					count++;

					System.out.println("<성적입력완료>");
					System.out.println();
					
				}
				break;

			case 2://출력
				System.out.println("[성적출력]");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				
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
			case 4://검색
				System.out.println("[학생검색]");
				
				System.out.println("검색할 학생>>");
				String search = scanner.next();
				int temp = 0;
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				
				for(int i=0;i<count;i++) {
					if(name[i].contains(search)) {
						temp = 1;
						System.out.printf("%d\t",no[i]);
						System.out.printf("%s\t",name[i]);
						for(int j=0;j<score[0].length;j++) {
							System.out.printf("%d\t",score[i][j]);
						}
						System.out.printf("%.2f\n",avg[i]);
					}
				}
				if(temp==0) System.out.println("검색결과가 없습니다.");
				System.out.println();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
			}
			
		}
		scanner.close();
		
		
//		// 순차정렬
//		int[] a = {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		
//		// 역순정렬
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
		
//		// 검색
//		int[] a = {1,2,3,4,5};
//		int temp = 0;
//		int count = 0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==0) {
//				System.out.println("해당문자가 있습니다.");
//				count++;
//				temp = 1;
//			}
//		}
//		if(temp==0) System.out.println("해당문자가 없습니다.");
//		else System.out.println("해당문자 개수 : "+count);
	}

}
