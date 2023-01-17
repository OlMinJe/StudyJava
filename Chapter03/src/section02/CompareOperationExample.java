package section02;

public class CompareOperationExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;
		// 대입 연산자는 우선순위가 제일 맨 마지막임
		
		System.out.println("result1: " + result1); // true
		System.out.println("result2: " + result2); // false
		System.out.println("result3: " + result3); // true
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2;
		System.out.println("result4: " + result4); // true
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = num3 == num4;
		System.out.println("result5: " + result5); 
		// true -> 타입 상관 없다 -> 왜냐하면 이 과정도 연산이기 때문에 같은 타입으로 놔두고 비교한다.
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = num5 == num6;
		boolean result7 = num5 == (float)num6;
		System.out.println("result5: " + result6); 
		// false -> 같을거 같지만 가수분해 문제가 생겨서 비트값이 틀어짐 -> false가 나올 수 있는 확률이 있다.
		System.out.println("result6: " + result7); // true -> 깨질 위험이 없음
		
		String str1 = "JAVA";
		String str2 = "JAVA";
		boolean result8 = str1 == str2; // 자바는 객체가 아닌 이상 같은 값은 같은 곳에 저장,,?
		System.out.println(result8); // true = 같은 객체를 사용하면서 내용이 같아, 같은 걸로 봄
		
		String str3 = new String("JAVA");
		String str4 = new String("JAVA");
		boolean result9 = str3 == str4;
		boolean result10 = str3.equals(str4);
		System.out.println("result9: " + result9); // false = 얘는 내용은 같지만 서로 다른 객체를 참조하고 있어서 다르다.
		System.out.println("result10: " + result10); // true
	}

}