package j0129;// 페키지-없으면 에러, 없으면 자동생성.

public class TryClass extends Object {// 없으면 자동생성(Object)-11메소드
	// equals(),toString(),hashCode()...11개 메소드 생성
	
	TryClass(){// 기본생성자-없으면 자동생성
		super();// 자동생성-부모생성자 호출
	}
	
	
	
	void method() throws Exception{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		System.out.println(5);
	}
}
