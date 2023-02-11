package section08;

public class InstanceofExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// ride() 메서드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		//* [1]
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFace();
		}
		/**/
		
		/*[2] java 12부터 사용 가능
		if(vehicle instanceof Bus bus) {
			bus.checkFace();
		}
		/**/
		
		vehicle.run();
	}

}
