package section02;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println("car1.company: " + car1.company); // 현대부릉이
		System.out.println("car1.model: " + car1.model); // 오징어 그랜저
		System.out.println("car1.color: " + car1.color); // 무심한 블랙
		System.out.println("car1.maxSpeed: " + car1.maxSpeed); // 300
		System.out.println("car1.speed: " + car1.speed); // 0
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company); // 현대부릉이
		System.out.println("car2.model: " + car2.model); // 자가용 
		System.out.println("car2.color: " + car2.color); // 무심한 블랙
		System.out.println("car2.maxSpeed: " + car2.maxSpeed); // 300
		System.out.println("car2.speed: " + car2.speed); // 0
		System.out.println();
		 
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company: " + car3.company); // 현대부릉이
		System.out.println("car3.model: " + car3.model); // 자가용
		System.out.println("car3.color: " + car3.color); // 빨강
		System.out.println("car3.maxSpeed: " + car3.maxSpeed); // 300
		System.out.println("car3.speed: " + car3.speed); // 0
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company); // 현대부릉이
		System.out.println("car4.model: " + car4.model); // 택시
		System.out.println("car4.color: " + car4.color); // 검정
		System.out.println("car4.maxSpeed: " + car4.maxSpeed); // 300
 		System.out.println("car4.speed: " + car4.speed); // 200
		
	}

}
