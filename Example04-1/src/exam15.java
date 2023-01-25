
public class exam15 {

	public static void main(String[] args) {
		// 회문수를 구하는 프로그램이다. 
		// 회문수(palindrome)란? 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		// 예를 들면 '12321'이나 '13531' 같은 수를 말한다.
		// [Hint] 나머지 연산자를 이용하기
		
		int number = 12311;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while (tmp != 0) {
			/*
			result = number%10*10000 + (int)(number%100*0.1)*1000 + (int)(number%1000*0.01)*100 +
					(int)(number%10000*0.001)*10 +(int)(number%100000*0.0001);  
			*/
			result = result * 10 + tmp % 10;
			tmp /= 10;
			
			
			System.out.println(result);	
		}
		
		if (number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}

	}

}
