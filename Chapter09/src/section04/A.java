package section04;

public class A {
	public void method1(final int age) {
		final int var = 1;
		int local = 1;
		
		class B {
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
			}
	
			// 로컬 변수를 수정할 경우 에러남
			//arg = 2;
			//var = 2;
		}
	}
	
	B b = new B();
	b.method2();
}
