package section06.hyundai;

// import 문으로 다른 패키지 클래스 사용
import section06.hankook.SnowTire;
import section06.kumho.AllSeasonTire;

public class Car {
	//Tire tire1 = new Tire(); // error: The type Tire is ambiguous(모호하다)
	section06.hankook.Tire tire1 = new section06.hankook.Tire();
	section06.kumho.Tire tire2 = new section06.kumho.Tire();
	
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();	
}
