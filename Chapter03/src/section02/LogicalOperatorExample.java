package section02;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//int charCode = 'A';
		int charCode = 'a';
		//int charCode = '0';
		
		if (65 <= charCode && charCode <= 90) {
			System.out.println("대문자 이군용갈희");
		}
		
		if (97 <= charCode && charCode <= 122) {
			System.out.println("소문자이면 소가 문자해?ㅋ");
		}
		
		if (48 <= charCode && charCode <= 57) {
			System.out.println("숫자송");
		}
		
		//------------------------------------------
		
		//int value = 6;
		int value = 7;
		
		/* [1]
		if (value % 2 ==0 || value % 3 == 0) {
			System.out.println("2와 3의 배수군하? 배구수");
		} else {
			System.out.println("아니구나,,,");
		}
		*/
		
		//* [2] 좀 더 효율적인 코드 찾기
		boolean result = value % 2 ==0 || value % 3 ==0;
		if(!result) {
			System.out.println("2또는 3의 배수가 아닙니다.");
		}
		/**/
	}

}
