package section02;

public interface Service {
	default void defaultMethod1() {
		System.out.println("dafault 1 Method");
		defaultCommon();
		// 여기에서 사용 가능 -> static이라서
		staticCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("dafault 2 Method");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("default Method 중복 코드 1");
		System.out.println("default Method 중복 코드 2");
	}
	
	static void staticMethod1() {
		System.out.println("default Method 중복 코드 1");
		staticCommon();
		//defaultCommon(); // 사용불가
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("static Method 중복 코드 1");
		System.out.println("static Method 중복 코드 2");
	} // 내부적으로 호출하고 싶을 때 사용 
	
	// static끼리 교환 가능
	// 대신 외부에 유출되지 않도록 private로 생성한다.
}
