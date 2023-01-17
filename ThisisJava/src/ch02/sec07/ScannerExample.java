package ch02.sec07;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		//int x = Integer.parseInt(scanner.nextLine());
		System.out.printf("x의 값은: %d\n", x);
		
		System.out.print("y값 입력: ");
		int y = Integer.parseInt(scanner.nextLine());
		// String strX = Scanner.nextLint();
		// int y = Integer.parseInt(stry);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			
			if(data.equals("q")) {
				break;
			}
			
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}

}
