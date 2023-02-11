package section04;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); // 오류
		//ia.methodC(); // 오류
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		//ib.methodA(); // 오류
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
