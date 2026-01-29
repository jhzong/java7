package j0127;

public class C07 {

	public static void main(String[] args) {
		
		Car c = null;
		FireCar f1 = new FireCar();
		FireCar f2 = null;
		
		AmbulCar a1 = null;
		
		
		f1.water(); //가능
//		f2.water(); //불가능
		
		c = f1; //자동형변환,타입생략가능
		f2 = (FireCar)c; //강제형변환
		f2.water(); //가능
		
		a1 = (AmbulCar)c;
		//a1.water();
		
//		Tv t1 = new Tv();
//		Car c3 = (Car)t1; //상속일때만 가능
		
		
		//형변환
		int a = 10;
		long aa = a; //자동형변환,타입생략가능

		long b = 20;
		int bb = (int)b; //강제형변환
		
		
		
		
		
//		FireCar f = new FireCar();
//		f.color="red";
//		System.out.println(f.color);

	}

}
