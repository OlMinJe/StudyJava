package section03;

public class Computer extends Calculator {
	int num = 100;
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 클래스(객체)의 areaCircle() 실행");
		
		System.out.println(super.num);
		
		return Math.PI * r * r;
	}
}
