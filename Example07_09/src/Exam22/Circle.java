package Exam22;

public class Circle extends Shape {
	double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}