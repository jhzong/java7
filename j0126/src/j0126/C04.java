package j0126;

public class C04 {

	public static void main(String[] args) {
		
		// 예제) 원을 그려라
		// 점과 반지름
		Ci c1 = new Ci();
		c1.draw();// 상속받은 변수,매소드는 바로 사용가능
		
//		Point p = new Point(5,5);
		Ci c2 = new Ci(new Point(5,5),50);
		c2.draw();
		
		// 예제) 삼각형을 그려라
		// 점3개의 좌표 => Point 3개 필요
		// 1)개별
//		Point p1 = new Point(0,0);
//		Point p2 = new Point(10,0);
//		Point p3 = new Point(0,10);
//		
//		Triangle t1 = new Triangle(p1,p2,p3);
//		t1.draw();
//		
//		// 2)배열
//		Point[] p = {p1,p2,p3};
//		Triangle t2 = new Triangle(p);
//		t2.draw();
		
		// 객체선언 : 다른 클래스를 가져와 사용
//		Circle c = new Circle();
//		c.x = 0;
//		c.y = 0;
//		c.r = 10;
		
//		Circle2 cc = new Circle2();
//		cc.x = 0;// Point에서 상속
//		cc.y = 0;// Point에서 상속
//		cc.r = 10;
//		cc.z = 0;//없는 변수 사용시 에러
		
//		Circle3 ccc = new Circle3();
//		ccc.x = 0;// 에러
//		ccc.p.x = 0;// 참조변수.참조변수.변수명(※포함)
//		ccc.p.y = 0;
//		ccc.r = 10;
	}

}
