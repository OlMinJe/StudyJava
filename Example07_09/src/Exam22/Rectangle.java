package Exam22;

public class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height){
		//this(new Point(0,0), width, height);
		//super(0); // 생략 가능
		this.width = width;
		this.height = height;
	}
	
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width == height? true : false;
	}
	
}
