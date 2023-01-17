
public class Exam01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 65
				
		System.out.println(1 + x <<33); // 6
		// 33은 32보다 커서 다시 돌아가 1이 남음 -> 1부터 다시 시작 = 3 X 2의1승
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13
		System.out.println(x+=2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); //false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B -> 증감 연산자는 형 변환을 하지 않는다.
		System.out.println(c++); // B
		System.out.println(c); // C
	}

}
