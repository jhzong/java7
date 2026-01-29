package j0127;

import java.util.ArrayList;

public class Buyer {
	String name = "홍길동";
	int money = 1000;
	int bonusPoint = 0;
	
	
	//배열10개 선언 : 같은타입만 가능, 10개 이상은 넣을수 없음
	// 삭제,추가 불가능
	int count=0;
//	Product[] cart = new Product[10];
	// list,set,map
	ArrayList list = new ArrayList(); //컬렉션:객체를 담는 배열
	
	//다형성
	void buy(Product p) {
//		cart[count] = p; //구매물품저장
		list.add(p);     //list추가
		count++;
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매가 되었습니다.");
	}
	

}
