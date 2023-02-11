package test01.Exam06;

public class Exam06 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Exam06() {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAvg() {
		return (int)(getTotal()/3.0 * 100 + 0.5) / 100.0f;
	}
}
