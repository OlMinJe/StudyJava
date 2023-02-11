package section08;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle[] va = new Vehicle[3];
		va[0] = new Bus();
		va[1] = new Taxi();
		va[2] = new Driver();
		// 타입 불일치 에러가 뜬다. (Type mismatch: cannot convert from Driver to Vehicle)
		// 상위 타입 클래스를 따라감.
	}

}
