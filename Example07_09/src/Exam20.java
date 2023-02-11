
class Exam20 {

	public static void main(String[] args) {
		// 오버라이딩 관계라는 것을 알 수 있다.
		Parent p = new Child();
		Child c = new Child();
	
		System.out.println("p.x = " + p.x); // p.x = 100
		p.method(); // Child Method
		
		System.out.println("c.x = " + c.x); // c.x = 200
		c.method(); // Child Method
	}	
}

class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method"); 
	}
}

class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}	
}
/* 결과
p.x = 100
Child Method
c.x = 200
Child Method
/**/