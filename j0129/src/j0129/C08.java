package j0129;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 10;
		Integer b = new Integer(10);
		BigInteger c = new BigInteger("1234567890123");
		
		// String, StringBuffer
//		StringBuffer sb = new StringBuffer("0123");
//		sb.append("4");
//		System.out.println(sb);
//		System.out.println(sb.charAt(0));
//		
//		String str = "0123";
//		str = str+4;
//		System.out.println(str);
//		System.out.println(str.charAt(0));
		
		
//		String str ="0";
//		int a = 0;
//		for(int i=0;i<10;i++) {
//			str += i;
//		}
//		System.out.println(str);
		
		
		// .subString(x,y)-문자열 잘라내기(x~y)(x<y)
//		// 12345
//		String txt = "10조12345번";
//		System.out.println(txt.substring(3, 8));
//		
//		// .charAt()
//		System.out.println(txt.charAt(2));
		
		// .split() .valueOf() .parseInt()
//		String txt = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt.split(",");
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg = Double.parseDouble(arr[6]);
//		System.out.println(Arrays.toString(arr));
		
		
		// .trim()
//		String txt = "   a   b   c   ";
//		String txt2 = "   abc   ";
//		System.out.println(txt);
//		System.out.println(txt2);
//		System.out.println(txt.trim());
//		System.out.println(txt.replace(" ",""));
//		System.out.println(txt2.trim());
		
		// ※ .replace() ※
//		String txt2 = "aaabbbcdeaaabcccceaeaeab";
//		String txt3 = txt2.replace("a", "A");
//		System.out.println(txt3);
//		System.out.println(txt2.length() - txt2.replace("a", "").length());
		
		
		
		// ※ .indexOf() ※
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		System.out.println("문자길이 : "+txt.length());
//		int count = 0;
//		for(int i=0;i<txt.length();i++) {
//			if(txt.indexOf("e",i)!=-1) {
//				System.out.println("위치값 : "+txt.indexOf("e",i));
//				i=txt.indexOf("e",i);
//				count++;
//			}else break;
//		}
//		System.out.println("e의 개수 : "+count);
		
//		System.out.println(txt.indexOf("e"));//txt.indexOf("e")
//		System.out.println(txt.indexOf("e",8+1));
//		System.out.println(txt.indexOf("e",17+1));
//		System.out.println(txt.indexOf("e",19+1));
//		System.out.println(txt.indexOf("e",21+1));
		
		
		// .equals() .contains()
//		String[] name = {
//			"홍길동","유관순","이순신","강감찬",
//			"김구","김유신","홍길순","홍길자","유관자","이순자"
//			};
//		
//		int temp = 0;
//		for(int i=0;i<name.length;i++) {
//			if (name[i].contains("순")) {
//				System.out.println(i+":"+name[i]);
//				temp=1;
//			}
//		}
//		
//		System.out.println();
//		if(temp==0) System.out.println("검색결과없음");
//		else {
//			System.out.println("변경할사람>>");
//			int no = scanner.nextInt();
//			// 1.이름입력
//			System.out.println(name[no]+"을(를) 변경>>");
//			String newname = scanner.next();
//			
//			// 2.이름변경
//			name[no] = newname;
//			
//			// 3.이름출력
//			for(int i=0;i<name.length;i++) {
//				System.out.print(name[i]+" ");
//			}
//		}
	}

}
