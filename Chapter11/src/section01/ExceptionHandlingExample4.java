package section01;

public class ExceptionHandlingExample4 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};

		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch (NullPointerException | NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
}
