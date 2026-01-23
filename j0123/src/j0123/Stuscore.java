package j0123;

public class Stuscore {
	{// 초기화블록
		this.no = count+1;
		count++;
	}
	Stuscore() {}
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	void cal(int kor,int eng,int math) {
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	static int count;//클래스변수-객체선언X(클래스명.변수명)
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}
