package j0121_01;

public class C02 {

	public static void main(String[] args) {
		// 숫자타입->문자열타입
		System.out.println(""+7+7.7);
		
		// 문자열타입->int타입,double타입
		int a = Integer.parseInt("77");
		double b = Double.parseDouble("77.7");
		System.out.println(a);
		System.out.println(b);
	}

}
