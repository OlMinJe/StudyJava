
public class PlayginCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	public PlayginCard(int k, int n) {
		kind = k;
		num = n;
	}
	
	public static void main(String[] args) {
		PlayginCard card = new PlayginCard(1, 1);
	}
	
	
	// 클래스 변수(static변수): width, height
	// 인스턴스 변수: kind, num
	// 지역 변수: card, k, n, args
}
