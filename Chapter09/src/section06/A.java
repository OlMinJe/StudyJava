package section06;

public class A {
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		String field = "B-field";
		void method() {
			System.out.println("B-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	// B클래스를 실행할 수 있는 A의 인스턴스 메소드를 생성한다.
	void useB() {
		B b = new B();
		b.print();
	}
	
}
