package section04;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 20);
		int result3 = Calculator.minus(100, 50);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		Calculator cal = new Calculator();
		double result4 = 10 * 10 + cal.pi;
		int result5 = cal.plus(10, 5);
		int result6 = cal.minus(10, 5);

		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		
		Calculator.pi = 2.5;
		System.out.println("Calculator.pi: " + Calculator.pi); // 2.5
		System.out.println("cal: " + cal.pi); // 2.5
		
		cal.pi = 3.5;
		System.out.println("Calculator.pi: " + Calculator.pi); // 3.5
		System.out.println("cal: " + cal.pi); // 3.5
		
		Calculator yourCal = new Calculator(); // 새로운 객체를 생성하고 나서 확인할 경우
		yourCal.pi = 4.5;
		System.out.println("Calculator.pi: " + Calculator.pi); // 4.5
		System.out.println("cal: " + cal.pi); // 4.5
		System.out.println("yourCal: " + yourCal.pi); // 4.5
		// 다 바뀐다. -> 같은 메모리 공간을 사용한다.
	}

}
