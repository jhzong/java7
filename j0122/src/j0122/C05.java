package j0122;

public class C05 {

	int aa = 0;//인스턴스
	static int bb = 0;//클래스 변수
	
	
	public static void main(String[] args) {
		C05 c1 =new C05();
		System.out.println(c1.aa);
		System.out.println(bb);
		
		int a = 0;
		
		// 흰색,true,7
		Tv t1=new Tv();
		t1.color="흰색";
		t1.power=true;
		t1.channel=7;
		
		
		// 검정,falue,10
		Tv t2=new Tv();
		t2.color="검정";
		t2.power=false;
		t2.channel=10;

	}

}
