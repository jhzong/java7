package j0130;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 특정값만 입력받고자 할때 enum을 사용.
		Gender g = Gender.남성;
//		Gender g2 = "남자";
		System.out.println(g);
		
		Person p = new Person();
		p.g = Gender.남성; // g = "남성";
		
		
		
//		Day today = Day.월;
//		
//		System.out.println(today);
		
//		while (true) {
//			System.out.println("요일 입력>>");
//			String day = scanner.next();
//			System.out.println("요일 : "+day);
//		}

	}

}
