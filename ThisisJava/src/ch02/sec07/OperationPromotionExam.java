package ch02.sec07;

public class OperationPromotionExam {

	public static void main(String[] args) {
		byte result1 = 10 + 20; 
		// 컴파일 단게에서 연산하여 byte result1 = 30;으로 변환 후 컴파일
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		byte result2 = (byte) (v1 + v2); // 연산(실행) 단계에서 계산 [연산 후에 변환]
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000;
		long result3 = v3 + v4 + v5; 
		// 실행 단계에서 long 형으로 변환 후 연산한다.
		System.out.println(result3);
		
		char v6 ='A';
		char v7 = 1;
		int result4 = v6 + v7;
		// 실행 단계에서 int형으로 변환후 연산
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8/4; // 정수와 정수 연산결과는 정수
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9/4;
		double result7 = v9/4.0;
		System.out.println(result6);
		System.out.println(result7);

		int v10 = 1;
		int v11 = 2;
		double result8 = v10/v11; 
		System.out.println(result8);

	}

}
