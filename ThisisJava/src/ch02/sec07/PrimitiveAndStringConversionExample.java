package ch02.sec07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		String str1 = "10";
		System.out.println(str1 + 10);
		
		int value1 = Integer.parseInt(str1);
		System.out.println(value1 + 10);
		
		String str2 = "3.14";
		System.out.println(str2 + 10);
		
		double value2 = Double.parseDouble(str2);
		System.out.println(value2 + 10);
		
		String str3 = String.valueOf(value1);
		String str4 = String.valueOf(value2);
		System.out.println(str3 + str4);
	}

}
