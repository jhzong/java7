package j0123;

public class C04 {
	
	static void add(int a,int b) {
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 9;
		int c = 5;
		
		//Method 객체선언
		Method m = new Method();
		//a,b를 Method로 보내 평균값을 리턴받아 출력
//		double result = m.avg(a, b);
//		System.out.println(result);
		
		//a,b,c를 Method로 보내 합계를 리턴받아 출력
//		int result2 = m.total(a, b, c);
//		System.out.println(result2);
		
		//a,b를 Method의 input으로 보내 연산결과 출력
//		m.input();
		
		//
//		int result3 = m.input2();
//		System.out.println("a+b="+result3);
		
		// cal()
//		m.cal();
		
		// cal2();
//		int[] result = m.cal2();
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		// 함수호출 - 매개변수로 보내 리턴받기
		int[] score = new int[3];
		m.cal3(score);
		for(int i=0;i<score.length;i++) {
		System.out.println(score[i]);
	}
//		C04.add(a, b);
		

	}

}
