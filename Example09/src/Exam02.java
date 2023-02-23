/*
 * 02. 다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 멤버변수인 x, y, z의 값을 비교하도
록 오버라이딩하고, toString()은 실행결과를 참고해서 적절히 오버라이딩하시오.
*/
class Exam02 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	}

}

class Point3D {
	int x, y, z;

	Point3D() {
		this(0,0,0);
	}
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		(1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.
		*/
		if(obj instanceof Point3D target) {
			return x == target.x && y == target.y && z == target.z;
		}
		return false;
	}
	
	@Override
	public String toString() {
		/*
		(2) 인스턴스변수 x, y, z의 내용을 출력하도록 오버라이딩하시오.
		*/		
		return "[" + x + "," + y + "," + z + "]";
		
	}
}