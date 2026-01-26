package j0126_03;

public class C01 {

	public static void main(String[] args) {
		//1.Card 정의
		//2.Deck 정의
		//3.main에서 Deck 객체선언
		Deck d = new Deck();
		//4.앞에서 5개 출력
		Card[] c = d.pick();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].kind+","+c[i].num);
		}
		System.out.println("---------------");
		//5.셔플
		d.shuffle();
		System.out.println("---------------");
		//6.앞에서 5개 출력
		Card[] c2 = d.pick();
		for(int i=0;i<c2.length;i++) {
			System.out.println(c2[i].kind+","+c2[i].num);
		}

	}

}
