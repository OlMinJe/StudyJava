package exam05;

public class Tv extends Prodect {	

	Tv() {
		// 부모 클래스에 기본 생성자가 없는데 자식 클래스에서 기본생성자를 이용하여 클래스를 생성하려고 하기 때문에 발생한 에러
		// 해결 방법 [1] 상위 클래스의 생성자를 호출한다.
		//super(1000); 
		
		// [2] Parent 클래스에 기본생성자를 구현한다.
	}
	
	public String toString() {
		return "TV";
	}

}
