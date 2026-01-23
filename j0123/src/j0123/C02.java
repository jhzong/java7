package j0123;

public class C02 {

	public static void main(String[] args) {
		
		// 객체 사용목적 - 여러개 값을 저장
		// 배열 사용목적 - 각각 여러개 값을 저장
		
		// 선언X class명.변수명
		Card.width = 200;
		Card.height = 300;
		System.out.println(Card.width);

		// 선언후 참조변수.인스턴스변수
		Card c1 = new Card();
		c1.kind = "SPADE";
		
		System.out.println(c1.width);
		System.out.println(c1.kind);
		
		Card c2 = new Card();
	}

}
