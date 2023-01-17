package ch02.sec07;

public class printExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d\n", value);
		System.out.printf("상품의 가격: %6d\n", value); // 오른쪽 정렬
		System.out.printf("상품의 가격: %-6d\n", value); // 왼쪽 정렬
		System.out.printf("상품의 가격: %d06\n", value); // 빈자리 수를 0으로
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%d | %-10s | %10s\n", 1, name, job);
	}

}
