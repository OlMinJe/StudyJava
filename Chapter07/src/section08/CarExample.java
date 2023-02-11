package section08;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// Tire() 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		// 한국타이어 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// 금호타이어 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
/*
 * 회전합니다
 * 한국 타이어가 회전합니다.
 * 금호 타이어가 회전합니다.
*/

