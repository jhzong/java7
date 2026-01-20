package j0120_01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {

		//boolean,char,byte,short,int,long,float,double
		//등가비교 가능
//		int a =10;
//		if(a==10) System.out.println("맞아요.");
//		else System.out.println("틀려요.");
		
		//String은 등가비교 불가.==(X)
		//객체타입 .equals() 사용
		
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		String str4 = "10";
		
		System.out.printf("%s,%s,%s \n",str1,str2,str3);
		if(str1==str3) System.out.println("같아요.");
		else System.out.println("달라요.");
		
		if(str1.equals(str3)) System.out.println("같아요.");
		else System.out.println("달라요.");
		
		
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['수영','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
//		
//		// '수영'이 포함돼 있는지 판별
//		
//		// str1 '수영'?
//		if(str1.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//
//		if(str2.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str3.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str4.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str5.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
		
		
		
		
		
		
		// contains():검색요소의 유무(true/false), indexOf():검색요소의 유무와 위치값
		
		//String str = "123451234512345";
		//※예제※)indexOf()를 사용해 입력값이 몇개나 들어가 있는지 판별
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력>>");
//		String str = scanner.next();
//		System.out.println("찾을 번호>>");
//		String input = scanner.next();
//		
//		int count = 0;
//		int startNo = 0;
//		String s_print = "";
//		for(;;) {
//			int temp = str.indexOf(input,startNo);
//			if(temp==-1) break;
//			//3을 찾았을 경우
//			count++;
//			s_print += temp+" ";
//			startNo = temp+1;
//		}
//
//		System.out.printf("%s 위치 : %s \n",input,s_print);
//		System.out.printf("%s 개수 : %s \n",input,count);
		
//		System.out.println(str.indexOf("3",3));
//		System.out.println(str.indexOf("3",8));
//		System.out.println(str.indexOf("3",13));
		
//		//contains
//		if (str.contains("3")==true) {
//			System.out.println("3이 있습니다.");
//		}else {
//			System.out.println("3이 없습니다.");
//		}
		
		
//		// 예제)7이 몇번 입력됐는지 출력
//		int count = 0;
//		System.out.println("숫자를 입력>>");
//		String str = scanner.next();
//		String input = "";
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			input += (ch+" ");
//			if (ch=='7') count++;
//		}
//		
//		System.out.printf("입력값 : "+input+"\n");
//		System.out.printf("입력값 길이 : "+str.length()+"\n");
//		System.out.printf("7개수 : "+count+"\n");
		
//		//입력받은 숫자의 합을 구하라
//		System.out.println("숫자를 입력>>");
//		String str = scanner.next();
//		// 문자를 숫자로 변환(int no = '2'-'0';)
//		// 숫자를 문자로 변환(char ch = (char)(2+'0');//2+48=50)
//		int sum = 0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			sum += no;
//			if(i==0) s_print=no+"";
//			else s_print += (","+no);
//		}
//		
//		System.out.println("입력 숫자의 길이 : "+str.length());
//		System.out.println("출력 : "+s_print);
//		System.out.println("결과값 : "+sum);
		
		
//		//34.1592
//		double num = 34.1592;
//		double num2 = (Math.round(num*100))/100.0;
//		System.out.println(num2);
		
		
//		//round:반올림,ceil:올림,floor:버림
//		System.out.println(Math.round(34.95));
//		System.out.println(Math.ceil(34.95));
//		System.out.println(Math.floor(34.95));
		
//		Math.random() 0*10=0 <= int(Math.random()*10)+1 < 1*10+1
		
//		//예제)(1~5)랜덤숫자를 입력. 중복X
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		no1 = (int)(Math.random()*5)+1;
//		
//		for (;;) {
//			no2 = (int)(Math.random()*5)+1;
//			if (no1!=no2) break;
//		}
//		for (;;) {
//			no3 = (int)(Math.random()*5)+1;
//			if (no1!=no3 && no2!=no3) break;
//		}
//		
//		System.out.println("no1 : "+no1);
//		System.out.println("no2 : "+no2);
//		System.out.println("no3 : "+no3);
		
//		//예제_풀이)
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		no1 = (int)(Math.random()*5)+1;
//		for(;;) {
//			no2 = (int)(Math.random()*5)+1;
//			no3 = (int)(Math.random()*5)+1;
//			if(no1!=no2 && no2!=no3 && no1!=no3) break;
//		}
//		System.out.println("no1 : "+no1);
//		System.out.println("no2 : "+no2);
//		System.out.println("no3 : "+no3);
		
//		// 문자를 숫자로 변환
//		int no = '2'-'0';
//		System.out.println(no);// int숫자로 변환
//		
//		// 숫자를 문자로 변환
//		char ch = (char)(2+'0');//2+48=50
//		System.out.println(ch);
//		
//		//☆String을 char로 변형
//		String str = "123";
//		char str2 = str.charAt(0);//위치의 문자 한개 가져옴
//		
//		//☆숫자를 문자열로 변형
//		String str3 = 234 + "";
//		
//		//☆문자열을 int로 변형
//		String str4 = "20";
//		int num = Integer.parseInt(str4);
//		String str5 = "10";
//		int num2 = Integer.parseInt(str5);
//		System.out.println(num+num2);
		
//		// 학생성적
//		System.out.println("[ 학생성적 프로그램 ]");
//		System.out.println("1.학생성적입력");
//		System.out.println("2.학생성적출력");
//		System.out.println("3.학생성적수정");
//		int choice = scanner.nextInt();
//		
//		if(choice==1) {
//			System.out.println("성적입력");
//		}else if(choice==2) {
//			System.out.println("성적출력");
//		}else {
//			System.out.println("성적수정");
//		}
		
//		switch(choice) {
//		case 1:
//			System.out.println("성적입력");
//			break;
//		case 2:
//			System.out.println("성적출력");
//			break;
//		case 3:
//			System.out.println("성적수정");
//			break;
//		default:
//			break;
//		}
		
//		scanner.close();
	}

}
