package j0126;

public class Deck {
	
	final int CARD_NUM = 52;// 총 52장의 카드
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			//1,2,3,~,13 4번 반복
			c[i] = new Card();
			c[i].number = (i%13)+1;// 0,1,2,3~12
			c[i].kind = shape[i/13];// 0~12:spade,13~25:heart,26~38:diamond,39~51:clover
			
		}
	}// 기본생성자
	
	// 모든 카드를 출력하는 메소드
	// 지정한 카드 1장 뽑기
	Card pick(int index) {
		return c[index-1];
	}
	
	// 랜덤 1장 뽑기
	Card pick() {
		return c[(int)(Math.random()*52)];
	}
	
	// 5장 뽑기
	Card[] pick5() {
		// c[0],c[1],~,c[5]
		return new Card[] {c[0],c[1],c[2],c[3],c[4]};
	}
	
	// 카드섞기
	void shuffle() {
		for(int i=0;i<500;i++) {
			int rdm = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[rdm];
			c[rdm] =temp;
		}
		System.out.println("셔플완료");
	}
}
