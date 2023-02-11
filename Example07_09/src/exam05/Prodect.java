package exam05;

class Prodect {
	int price; // 제품의 가격
	int bounsPoint; // 제품구매 시 제공하는 보너스 점수
	
	// [2] Parent 클래스에 기본생성자를 구현한다.
	Prodect(){}
	// 하위클래스 tv 생성자에는 super() 호출하는 코드가 자동 삽입된다.
	// 상위 클래스인 product에는 이미 생성자가 정의되어 있으나 TV 생성자에서 호출하는 형식과 일치하지 않는다.
	
	Prodect(int price) {
		this.price = price;
		bounsPoint = (int)(price/10.0);
	}
}
