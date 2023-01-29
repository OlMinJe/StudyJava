package section04;

public class SupersonicAirplane extends Airplane {
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 상태 필드 선언
	public int flyMode = NOMAL;

	// 생략가능한 디폴트 생성자
	public SupersonicAirplane() {super();}
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();			
		}
	}
}
