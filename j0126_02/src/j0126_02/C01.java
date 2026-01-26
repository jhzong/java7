package j0126_02;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		
		// 앞에서 부터 5장 뽑기
		Deck d = new Deck();
		d.card5Print();
		d.card5Print(10);
		System.out.println("--------------------");
		
		// 셔플한 카드 5장
		Deck d2 = new Deck();
		d2.card5Print();
		d2.shuffle();
		d2.card5Print();
		System.out.println("--------------------");
		
		// 지정한 숫자부터 순서대로 5장
		Scanner scanner = new Scanner(System.in);
		System.out.println("번호입력(0~51)>>");
		int index = scanner.nextInt();
		Deck d3 = new Deck();
		d3.card5Print(index);
		
		
		scanner.close();
	}
	
}
