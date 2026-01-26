package j0126_02;

public class Deck {
	final int card_max = 52;
	Card[] c = new Card[card_max];
	String[] kind = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	// 순차정렬
	Deck(){
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%13)+1;
			c[i].kind = kind[i/13];
		}
	}
	
	// 앞에서부터 5장
	void card5Print() {
		for(int i=0;i<5;i++) {
			System.out.println(c[i].kind+","+c[i].number);
		}
	}
	
	// 지정한 숫자(index)부터 5장
	void card5Print(int index) {
		for(int i=index;i<index+5;i++) {
			System.out.println(c[i].kind+","+c[i].number);
		}
	}
	
	// 카드 섞기
	void shuffle() {
		for(int i=0;i<500;i++) {
			int rdm = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[rdm];
			c[rdm] = temp;
		}
	}
	
}
