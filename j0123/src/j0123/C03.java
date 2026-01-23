package j0123;

public class C03 {
	
	//클래스,인스턴스메소드

	int add(int a,int b) {//인스턴스메소드
		return a+b;
	}
	
	int sub(int a,int b) {
		return a-b;
	}
	
	int multi(int a,int b) {
		return a*b;
	}
	
	double divide(int a,int b) {
		return a/(double)b;
	}
	
	public static void main(String[] args) {

		C03 c = new C03();
		int a = 10;
		int b = 3;
		int result = c.add(a, b);
		int result2 = c.sub(a, b);
		int result3 = c.multi(a, b);
		double result4 = c.divide(a, b);
		
		System.out.printf("+:%d, -:%d, *:%d, /:%.2f",result,result2,result3,result4);

	}

}
