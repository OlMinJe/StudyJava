package exam25;
//Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
public class Exam25 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner b = o.new Inner();
		
		System.out.println(b.iv);		
	}
}
