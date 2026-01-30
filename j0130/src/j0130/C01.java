package j0130;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		// list-순서O 중복O,set-순서X 중복X,map-key(중복X)+value(중복O) 
		
		ArrayList list = new ArrayList();// 객체선언
//		List list2 = new ArrayList();// 다형성-부모의 참조변수로 자손객체를 다룸
		
		// 입력
		int a = 11;
		list.add(a);// int(Integer wrapper 클래스)->Object
		list.add(22);
		list.add(33);
		list.add(11);
		list.add(33);
		list.add(3);
		
		// 1개씩 출력
//		Object o = list.get(0);
		int aa = (int)list.get(0);
//		System.out.println(aa);
		
		// 삭제
		list.remove(3);
		
		// for문 전체출력
		for(int i=0;i<list.size();i++) {
			int no = (int)list.get(i);
			System.out.println(no);
		}
		
		// Iterator 전체출력
		Iterator it = list.iterator();
		while(it.hasNext()) {//hasNext():다음 데이터가 있는지 확인
			int list_data = (int)(it.next());
			System.out.println(list_data);
		}
	}

}
