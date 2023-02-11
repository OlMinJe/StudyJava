package section07;

public class ChildExample {
	public static void main(String[] args) {
		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"; // 불가능
		 * parent.method3(); // 불가능
		 */
		
		// 강제 타입 변환
		Child child = (Child)parent; // parent 객체를 child 타입으로 강제형변환함.
		// 자식 객체가 부모 타입으로 자동 변환된 후 -> 다시 자식 타입으로 변환할 때 사용한다.
		
		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2"; // 가능
		child.method1();
		child.method3(); // 가능
	}
}
