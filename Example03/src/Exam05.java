
public class Exam05 {

	public static void main(String[] args) {
		int num = 333;
		
		if (num/10 != 0) {
			num -= num%10;
			num++;
		}
		
		System.out.println(num);
	}

}
