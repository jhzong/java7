package j0126;

public class C05 {

	public static void main(String[] args) {
		Deck d = new Deck();// 객체선언
		
		// 지정한 카드 뽑기
		Card c = d.pick(52);
		System.out.println(c.kind+","+c.number);
		
		// 랜덤 1장 뽑기
		Card c2 = d.pick();
		System.out.println(c2.kind+","+c2.number);
		
		// 5장 뽑기
		Card[] cArr = d.pick5();
		for(int i=0;i<cArr.length;i++) {
			System.out.println(cArr[i].kind+","+cArr[i].number);
		}
		
	

	
	
		
	}

}
