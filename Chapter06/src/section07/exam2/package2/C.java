package section07.exam2.package2;
// 다른 패키지

import section07.exam2.package1.A;

public class C {
	A a1 = new A(true); // package1.A클래스의 public 생성자
	// A a2 = new A(1); // package1.A클래스의 default 생성자 접근 불가
	//A a3 = new A("문자열"); // package1.A클래스의 private 생성자 접근 불가
}

