package section04;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
/*
		// Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
			// Integer 객체 내부의 int 값을 리턴한다.
		
		// Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
		
		Integer obj1 = new Integer(50); // 쓸데없이 사용하였다.
		*/
		Integer obj1 = 50;
		Integer obj2 = 250;
		int res = obj1 + obj2;
		//int res = obj1 == obj2;
		System.out.println("res: " + res);
	}

}
