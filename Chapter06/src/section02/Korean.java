package section02;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	} // 이건 생성자임
	
	public Korean(String name) {
		this.name = name;
	} //이건 생성자 오버로딩임
}
