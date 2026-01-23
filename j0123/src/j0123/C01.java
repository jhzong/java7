package j0123;

import java.util.Arrays;

public class C01 {
	int aa;//인스턴스변수-객체선언후 참조변수.인스턴스변수
	
	//클래스변수-객체선언X 
	

	public static void main(String[] args) {
		
		Stuscore[] s = new Stuscore[5];
		s[0] = new Stuscore();
		s[0].no = 1;
		s[0].name = "홍길동";
		s[0].kor = 100;
		s[0].eng = 100;
		s[0].math = 100;
		s[0].total = s[0].kor+s[0].eng+s[0].math;
		s[0].avg = s[0].total/3.0;
		
		System.out.println(s[0].no);
		
		
//		//객체선언=>클래스명 참조변수명 = new 메소드명()
//		Student s1 = new Student();
//		s1.no=1;
//		s1.id="aaa";
//		s1.name="홍길동";
//		Student s2 = new Student();
//		s2.no=2;
//		s2.id="bbb";
//		s2.name="유관순";
//		Student s3 = new Student();
//		s3.no=3;
//		s3.id="ccc";
//		s3.name="이순신";
		
		
//		//객체-여러타입+메소드 동시에 저장 가능
//		Tv aaa = new Tv();//객체선언
//		aaa.channel = 10;
//		aaa.color = "white";
//		System.out.println(aaa);
//		System.out.println(aaa.channel+","+aaa.color);
//		
//		//배열-동일 타입의 데이터 여러개 저장
//		int[] aa = {1,2};
//		System.out.println(aa);//주소값
//		System.out.println(aa[0]+","+aa[1]);//주소값의 0번 위치의 값
//		
//		int[] bb = {0,0};
//		bb=aa;
//		System.out.println(bb[0]+","+bb[1]);
//		aa[0]=100;
//		System.out.println(bb[0]+","+bb[1]);
//		
//		//8가지 데이터 타입-1개의 데이터 저장
//		boolean a=true;
//		char b='a';
//		byte c=1;
//		short d=1;
//		int e=1;
//		long f=1;
//		float g=1;
//		double h=1;
//		System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g+","+h);

	}

}
