package j0121_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 입력>>");
//		int num = scanner.nextInt();
//		System.out.println("입력값:"+num);
		
		scanner.close();
		
		String num2 = JOptionPane.showInputDialog("숫자 입력");
				System.out.println("입력2:"+num2);
	}

}
