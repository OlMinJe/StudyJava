package section06;

public class MainStringArrayArguments {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 입력값 부족");
			System.exit(0);
		}
		/*
		String strNum1 = args[0];
		// 이때 두 개의 값의 주소가 담긴 배열이 생성된다.
		String strNum2 = args[1];
		// 값은 각각 객체로 생성됨.
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		*/
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
