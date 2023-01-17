package section08;

public class BitShiftExample {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3; // 1 곱하기 2의3제곱
		// 왜 숫자 1이 2냐면, bit로 따질 경우 1은 2이기 때문
		System.out.println("result1: " + result1); // 8
		
		// shift 연산자 사용한 것과 똑같다.
		int result2 = num1 * (int)Math.pow(2, 3);
		System.out.println(result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}

}
