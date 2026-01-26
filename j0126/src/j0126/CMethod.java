package j0126;

public class CMethod {
	
	int[] method(int num) {
//		method() {};//기본생성자-생성자가 1개라도 없으면 자동생성
		
//		int a = 10;
		int[] arr = {1,2,3};
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]*num;
		}
		return arr;
	}
}
