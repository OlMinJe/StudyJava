
public class Exam09 {

	public static void main(String[] args) {
		char ch = 'a';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') ||  ('0' <= ch && ch <= '9');
		
		System.out.println(b);
	}

}
