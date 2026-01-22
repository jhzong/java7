package j0122;

public class C05 {

	int aa = 0;//인스턴스
	static int bb = 0;//클래스 변수
	
	void cal(int a, int b) {//인스턴스 메소드
		System.out.println("합:"+(a+b));
		System.out.println("차:"+(a-b));
		System.out.println("곱:"+a*b);
		System.out.println("분:"+a/b);
		
	}
	
	static int addSub(int a,int b) {
		int result=a+b;
		int result2=a-b;
		
		return result;
	}
	
	static int add(int a,int b) {//클래스 메소드
//		System.out.println("합:"+(a+b));
		return a+b;
	}
	
	static int sub(int a,int b) {
//		System.out.println("차:"+(a-b));
		return a-b;
	}
	
	static int multi(int a,int b) {
//		System.out.println("곱:"+a*b);
		return a*b;
	}
	
	static double divide(int a,int b) {
//		System.out.println("분:"+a/b);
		return a/(double)b;
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		double result4 = 0;
		
		//return문사용-사칙연산
		result1=add(a, b);
		result2=sub(a, b);
		result3=multi(a, b);
		result4=divide(a, b);
		System.out.printf("%d,%d,%d,%.2f",result1,result2,result3,result4);
		
		
//		//인스턴스 메소드 사용방법
//		C05 c1 = new C05();
//		c1.cal(a, b);
		
		//클래스 메소드 사용방법-같은 클래스 내에서 클래스명 생략
//		add1(a, b);
//		sub(a, b);
//		multi(a, b);
//		divide(a, b);
		
//		int a = 10;//기본변수:프린트->데이터값
//		int[] aArr = {1,2,3};//참조변수:프린트->주소값
//		
//		System.out.println(a);
//		System.out.println(aArr);
		
//		C05 c1 =new C05();
//		System.out.println(c1.aa);
//		System.out.println(bb);
//		
//		int a = 0;
//		
//		// 흰색,true,7
//		Tv t1=new Tv();
//		t1.color="흰색";
//		t1.power=true;
//		t1.channel=7;
//		
//		
//		// 검정,falue,10
//		Tv t2=new Tv();
//		t2.color="검정";
//		t2.power=false;
//		t2.channel=10;

	}

}
