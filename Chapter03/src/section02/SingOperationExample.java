package section02;

public class SingOperationExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("X: " + x);
		
		byte b = 100;
		/* 음수 연산일때는 int 타입으로 자동 변환 후 계산하기 때문에 byte 타입의 변수에 값을 받을 수 없다.
		byte y = -b; 
		*/
		int y = -b;
		System.out.println("y: " + y);
	}
}
