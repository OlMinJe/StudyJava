package section02;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		
		// java11 이전 방식
		int score1 = 0;
		switch (grade) {
		case "A": 
			score1 = 100; 
			break;
		case "B": 
			int result = 100 - 20; 
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		
		System.out.println(score1);
		
		// java12 부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> 80;
			default -> 60;
		};
		
		System.out.println("score2: " + score2);
		
		int score3 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		};
		System.out.println("score3: " + score3);
	}

}
