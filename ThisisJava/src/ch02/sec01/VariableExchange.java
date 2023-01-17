package ch02.sec01;

public class VariableExchange {
// 변수 교환
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}

}
