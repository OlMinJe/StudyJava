package section02;

public class SwitchNotBreakCaseExample {

	public static void main(String[] args) {
		int start = 8;
		int end = 10;
		int time = (int) (Math.random() * (end-start+1)) + start;
		
		switch(time) {
			case 8: 
				System.out.println("출근을 합니다.");
			case 9: 
				System.out.println("회의를 합니다.");
			case 10: 
				System.out.println("업무를 봅니다");
			default: 
				System.out.println("외근을 나갑니다");
		}
	}

}
