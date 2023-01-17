package section02;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0;
		//double z = x / y;
		double z = x % y;
		/*
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else { 
			System.out.println(z);
		}
		*/
		if(Double.isInfinite(z)) {
			System.out.println("0으로 나누기를 시도 했습니다.");
		} else if(Double.isNaN(z)) {
			System.out.println("0으로 나머지 구하기를 시도 했습니다.");
		} else { 
			System.out.println(z);
		}
	}

}
