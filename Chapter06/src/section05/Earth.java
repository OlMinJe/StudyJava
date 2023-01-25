package section05;

public class Earth {
	// 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 상수 선언
	static final double EARTH_SURFACE_AREA;
	// 정적 블록에서 상수 초기화 -> 상수 선언만 했을 경우 정적 블록에서 초기화를 필수로 해준다.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
