package j0122;

public class Stuscore {
	static int count;//클래스
	
	int no;//인스턴스
	String name;
	int kor;
	int eng;
	int math;
	int total=kor+eng+math;
	double avg=total/3.0;
	
	public void calTotal() {
		total=kor+eng+math;
	}
	
	public void calAvg() {
		avg=total/3.0;
	}
}
