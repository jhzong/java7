package j0126;

public class Stuscore {
	
	{//초기화블록:생성자 공통 부분 정리
		count++;
		no = count;
	}
	
	Stuscore() {}//기본생성자-클래스명과 동일, 리턴값X, void 안붙임
	
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math;
	}
	
	public void calAvg(int kor,int eng,int math) {
		this.avg = this.total/3.0;
	}

}
