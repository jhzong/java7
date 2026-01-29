package j0127;

public class C04 {

	// 기본생성자 - 생성자가 없으면 자동으로 기본생성자를 생성해줌.(컴파일)
	// 클래스변수 - 객체선언없이 클래스명.변수명
	static int aa; // 초기화 자동으로 설정됨.
	// 인스턴스변수 - 객체선언후 참조변수명.변수명
	int b;         // 초기화 자동으로 설정됨.
	
	public static void main(String[] args) {
		//지역변수는 초기화가 자동으로 되지 않기에 초기화를 해줘야 함.
		int a=0; // 지역변수는 초기화 안됨.
		System.out.println(a);
		
		C04 c = new C04();
		System.out.println(c.b);
		
		System.out.println(aa);

	}

}
