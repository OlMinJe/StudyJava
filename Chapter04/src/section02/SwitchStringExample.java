package section02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String  state = "safe";
		
		switch(state) {
		case "safe":
			System.out.println("안전합니다.");
			break;
		case "danger":
			System.out.println("위험합니다.");
			break;
		default:
			System.out.println("무난합니다");
		}
	}

}
