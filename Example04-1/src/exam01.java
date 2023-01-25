
public class exam01 {

	public static void main(String[] args) {
		// [1] int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 10;
		if(x > 10 && x < 20) {
			System.out.println("true01");
		}
		
		// [2] char형 변수 ch가 공백이나 탭이 아닐 때 treu인 조건식
		char ch = ' ';
		if(ch != ' ' && ch != '\t') {
			System.out.println("true02");
		}
		
		// [3] char형 변수 ch가 'x' 또는 'X' 일 때 true인 조건식
		char ch1 = 'a';
		if(ch1 == 'x' || ch1 == 'X') {
			System.out.println("true03");
		}
		
		// [4] char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식
		char ch2 = 'a';
		if(ch2 >= '0' && ch2 <= '9') {
			System.out.println("true04");
		}
		
		// [5] char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch3 = '1';
		if((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')) {
			System.out.println("true05");
		}
		
		// [6] int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		// 내 생일 구하는 조건식과 똑같음요
		int year = 300;
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("true06");
		}
		
		// [7] boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = true;
		if(!powerOn) {
			System.out.println("true07");
		}
		
		// [8] 문자열 참조변수 str이 "yes"일 때 true인 조건식
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("true08");
		}
		
	}

}
