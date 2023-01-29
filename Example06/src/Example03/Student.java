package Example03;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal(){
		return kor + eng + math;
	}
	
	public float getAverage() {
		return (int)(getTotal()/3.0 * 100 + 0.5) / 100.0f;
		//return Math.round(getTotal() / 3.0f);
		//(float) (Math.round(((float)(kor + eng + math)/3.0)*100)/100.0)
	}
}
