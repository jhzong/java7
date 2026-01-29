package j0127;

import java.util.ArrayList;

public class C10 {

	public static void main(String[] args) {
		Card c1 = new Card("SPADE",1);
		// ArrayList 자동으로 크기 증가, 추가,수정,삭제가능
		// 최초10개 - 자동10개증가
		// ArrayList 명령어
		// add:추가, get:읽어오기, remove:삭제, size():개수
		
		ArrayList list = new ArrayList();
		// 부모의 참조변수 자손의 객체 다루는 것.
		list.add(new Card("SPADE",1)); //list 추가
		list.add(new Card("SPADE",2));
		list.add(new Card("SPADE",3));
		list.add(new Card("SPADE",4));
		list.add(new Card("SPADE",5));
		
//		Object o = list.get(0); //list들어가면 무조건 Object타입 변경
		Card c = (Card)list.get(0);
		System.out.println(c.kind);
		
		for(int i=0;i<list.size();i++) {
			Card cc = (Card)list.get(i); //get : 읽어오기
			System.out.println(cc.kind+","+cc.number);
		}
		
		list.remove(0);
		list.remove(3);
		System.out.println("-----------------------");
		
		for(int i=0;i<list.size();i++) {
			Card cc = (Card)list.get(i); //get : 읽어오기
			System.out.println(cc.kind+","+cc.number);
		}
		

	}

}
