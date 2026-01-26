package j0126_03;

public class Deck {
	final int CARD_MAX = 52;
	Card[] c = new Card[CARD_MAX];
	String[] kind = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	// 순차나열(spade:1~13,heart:1~13,diamond:1~13,clover:1~13)
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].kind = kind[i/13];
			c[i].num = (i%13)+1;
		}
	}
	
	Card[] pick() {
		return new Card[] {c[0],c[1],c[2],c[3],c[4]};
	}
	
	// 카드 셔플
	void shuffle() {
		for(int i=0;i<500;i++) {
			int rdm = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[rdm];
			c[rdm] = temp;
		}
		System.out.println("셔플완료");
	}

}
