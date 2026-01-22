package j0122;

public class C06 {
	
	//함수선언
	static int add(int a,int b,int c){
		return a+b+c;
	}//add
	static int sub(int a,int b,int c){
		return a-b-c;
	}//sub
	static int multi(int a,int b,int c) {
		return a*b*c;
	}//multi
	static double divide(int a,int b,int c){
		return (a/b)/(double)c;
	}//divide
	
	static int[] cal(int a,int b,int c) {
		int[] re = new int[2];
		
		re[0]=a+b+c;
		re[1]=a-b-c;
		return re;
	}//2개 이상의 return값의 주소값을 배열로 넘김(return값이 하나가 아니면 에러)

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=2;
		int[] re;
		
//		int result=0,result2=0,result3=0;
//		double result4=0;
//		//add,sub,multi,divide
//		//결과값을 리턴받아 출력
//		result=add(a, b, c);
//		result2=sub(a, b, c);
//		result3=multi(a, b, c);
//		result4=divide(a, b, c);
//		
//		System.out.printf("%d %d %d %.2f",result,result2,result3,result4);
		
		re=cal(a, b, c);//데이터값이 아니라 주소값을 return받음
		System.out.println(re[0]+", "+re[1]);
	}

}
