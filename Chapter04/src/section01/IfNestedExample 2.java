package section01;

public class IfNestedExample {

	public static void main(String[] args) {
		int start = 80;
		int end = 100;
		
		int score = (int) (Math.random() * (end - start + 1)) + start;
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) { grade = "A+";	} 
			else { grade = "A"; }
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("당신의 학점은: " + grade);
		
	}

}
