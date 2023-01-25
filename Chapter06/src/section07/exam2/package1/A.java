package section07.exam2.package1;

public class A {
	A al = new A(true); // public 생성자 접근 가능
	A a2 = new A(1); // default 생성자 접근 가능
	A a3 = new A("문자열"); // private 생성자 접근 가능
	
	public A(boolean b) {
		
	}
	
	A(int b) {
		
	} // default
	
	private A(String s) {
		
	}
}
