package section02;

public class AExample {
	public static void main(String[] args) {
		A.B b = new A.B();
		//  A 객체 생성 없이 A클래스로 접근해서 B객체를 생성할 수 있다.
		
		System.out.println("b.field1");
		b.method1();
		
		System.out.println(A.B.field2);
		A.B.method2();
	}
}
