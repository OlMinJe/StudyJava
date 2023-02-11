package example;

public class Action {
	public static void main(String[] args) {
		Action(new B());
		Action(new C());

	}

	public static void Action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}

}
