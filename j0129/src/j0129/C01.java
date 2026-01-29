package j0129;

public class C01 {

	static int a;// 클래스변수-자동초기화O
	int b;		 // 인스턴스변수-자동초기화O
	
	public static void main(String[] args) {

		int c=0;// 지역변수-자동초기화X
		System.out.println(c);
		
		C01 c01 = new C01();
		System.out.println(c01.b);
		System.out.println(C01.a);
		System.out.println(a);// 같은 클래스 내에서 클래스명 생략가능
	}

}
