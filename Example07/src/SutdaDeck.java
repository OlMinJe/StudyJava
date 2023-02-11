class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10 + 1;
			int n = i+1;
			boolean isKwang = n==1 || n==3 || n==8;
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			// 0 ~ 19사이의 정수형 난수 구하기
			int k = (int)(Math.random() * cards.length);
			
			//card[i]와 card[k]의 위치 변경
			SutdaCard temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random() * cards.length);
		return cards[index];
	}
}














