package exam02;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	/* 내가 작성한 코드
	SutdaDeck() {
		for (int i = 0; i < CARD_NUM; i++) {
			if (i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else {
				cards[i] = new SutdaCard(i%10 + 1, false);
			}
		}
	}
	
	public void shuffle() {		
		for(int i = 0; i < CARD_NUM; i++) {
			int j = (int)(Math.random() * CARD_NUM);
			SutdaCard temp =  new SutdaCard();

			if (i == 0 || i == 2 || i == 7) {
				temp = cards[i];
				cards[j] = temp;
				cards[i] = new SutdaCard(j + 1, true);
			} else {
				temp = cards[i];
				cards[j] = temp;
				cards[i] = new SutdaCard(j + 1, false);
			}
		}
	}
	/**/
	
	//* 강사님 코드
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			int n = i+1;
			boolean isKwang = n == 1 || n == 3 || n == 8;
			
			cards[i] = new SutdaCard(num, isKwang);  
		}
	}
	
	void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int k = (int)(Math.random() * cards.length);
			
			SutdaCard temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
		}
	}
	/**/
	
	public SutdaCard pick() {
		int j = (int)(Math.random()*CARD_NUM) + 1;
		
		return cards[j - 1 ];
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
	}
}
