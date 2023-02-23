package section05;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		// 정수만 출력
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		// 소수 첫째 자리까지 출력
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
	}

}
