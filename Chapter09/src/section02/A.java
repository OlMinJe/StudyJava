package section02;

public class A {
	static class B {
		int field1 = 1;

		static int field2 = 2;
		
		B() {
			System.out.println("B-생성자 실행");
		}
		
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		static void method2() {
			System.out.println("B-method2 실행-java17부터 가능");
		}
	} // 정적 멤버 클래스 B 내부에도 일반 클래스와 같이 필드, 생성자, 메소드 선언을 할 수 있다.
	
	B field1 = new B();
	
	static B field2 = new B();
	
	A(){
		B b = new B();
	}
	
	void method1() {
		B b = new B();
	}
	
	static void method2() {
		B b = new B();
	}
}
