package section03;

public class CarEaxmple {

	public static void main(String[] args) {
		Car car = new Car(); // 기본 생성자가 추가되어서 작동함.
		
		car.setGas(5);
		
		if(car.isLeftGas()) {
			System.out.println("출발~");
			
			car.run();
		}

		System.out.println("gas를 주입하세요");
	}

}
