package section10;

public class Student extends Person {
	public int studentNo;

	public Student(String name, int sttdentNo) {
		super(name);
		this.studentNo = sttdentNo;
	}
	
	public void study() {
		System.out.println("공부를 합시다.");
	}

}
