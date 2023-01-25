package section02;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참고가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참고가 다름");
		} // 결과: 같음
		// 이유: 같은 값을 가진 경우에는 같은 값이 있는 주소 값으로 할당해주기 때문에 참조 주소가 같다.
		
		if(strVar1.equals(strVar2)) {
			System.out.println("str1 str2는 문자열이 같음");
		}
		
		String name1  = new String("문자열");
		String name2  = new String("문자열");
		if(name1 == name2) {
			System.out.println("name1과 name2는 참고가 같음");
		} else {
			System.out.println("name1과 name2는 참고가 다름");
		}

		if(name1.equals(name2)) {
			System.out.println("name1 name2는 문자열이 같음");
		}
	}

}
