package Example06;

public class MyPonit {
	int x;
	int y;
	
	public MyPonit(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 인스턴스 메서드로 작성하기
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+ (y-y1)*(y-y1));
	}
}
