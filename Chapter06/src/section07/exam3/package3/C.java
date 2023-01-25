package section07.exam3.package3;

import section07.exam3.package1.A;

public class C {
	void method() {
		A a = new A();
		
		a.field1 = 1;
		//a.field2 = 1; // defalut로 선언된 변수 접근 불가
		//a.field3 = 1; // private로 선언된 변수 접근 불가
		
		a.method1();
		//a.method2(); // X
		//a.method3(); // X
	}
}
