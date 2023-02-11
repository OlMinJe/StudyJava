package exam01;

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object 클래스의 toString()을 오버라이딩함 - 최고봉 조상을 오버라이딩함
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}