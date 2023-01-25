package section07.exam3.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1; // o
		a.field2 = 1; // o
		// a.field3 = 1; // x - private로 안됨
		
		a.method1(); // o
		a.method2(); // o
		//a.method3(); // x 	
	}
}
