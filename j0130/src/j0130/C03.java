package j0130;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C03 {

	public static void main(String[] args) {
//		HashMap<String, Object> map = new HashMap();
		
		Map<String,Object> map = new HashMap();
		List list = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		list.add(1);//[0]
		list.add(2);//[1]
		list.add(list2);//[2]:list2 
		list.add(list3);//[3]:list3
		
		// 입력-put
		map.put("name", "홍길동");
		map.put("boardlist", list);
		map.put("memberlist", list2);
		// 출력-get
		System.out.println(map.get("name"));
		
		// 전체출력 - map은 리스트를 상속X 따라서 Iterator 사용불가
		// map -> set 후 Iterator 사용
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		HashSet set = new HashSet();
//		set.add(1);//int->Integer->Object
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//		
//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			int a = (int)(it.next());
//			System.out.println(a);
//		}

	}

}
