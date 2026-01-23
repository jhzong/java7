package j0123;

public class Car {
	
	Car(){
		//Car("white","auto",5);
		this("white","auto",5);//this:다른 생성자를 호출할때 씀.
	}
	
	Car(String color,String gearType,int door){
		this.color = color;//인스턴스변수 this
		this.gearType = gearType;
		this.door = door;
	}
	
	String color;
	String gearType;
	int door;
}
