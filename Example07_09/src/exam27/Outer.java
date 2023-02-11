package exam27;


class Outer {
	int value=10;
	class Inner {
		int value=20;
		void method1() {
			int value=30;
			System.out.println("1번" + value);
			System.out.println("2번" + this.value);
			System.out.println("3번" + Outer.this.value);
		}
	} // Inner클래스의 끝
}

class Exam27 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();
	}
}