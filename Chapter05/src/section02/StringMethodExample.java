package section02;

public class StringMethodExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1', '3': System.out.println("남성 입니다."); break;
			case '2', '4': System.out.println("여성 입니다."); break;
			default: System.out.println("그 외국 머시기,,");
		}
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("틀려용");
		}
	}

}
