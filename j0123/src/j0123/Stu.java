package j0123;

public class Stu {
	Stu(){}//기본생성자
	
	Stu(String name, int kor, int eng, int math) {
		this.no = count+1;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		count++;
	}

	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}
