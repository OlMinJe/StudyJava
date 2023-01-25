package section02;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0-6인덱스
		String secondNum = ssn.substring(7); // 7부터 끝까지
		
		System.out.println(firstNum); // 880815
		System.out.println(secondNum); // 1234567
	}

}
