package section02;

public class Car {
	// 필드 선언
	String company = "현대부릉이";
	String model = "오징어 그랜저";
	String color = "무심한 블랙";
	int maxSpeed = 300;
	int speed;
	
	Car() {	} // 기본 생성자 
	
	Car(String model){
		// this.model = model;
		this(model, null, 0);
		// 매개 변수를 제일 많이 받는 생성자를 호출하여 값을 전달한다.
	} 
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 0);
	}
	
	Car(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
