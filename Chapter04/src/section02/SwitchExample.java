package section02;

public class SwitchExample {

	public static void main(String[] args) {
		int start = 1;
		int end = 6;
		int num = (int) (Math.random() * (end - start + 1)) + 1;
		
		switch(num) {
			case 1: 
				System.out.println("1입니당");
				break;
			case 2: 
				System.out.println("2입니당"); 
				break;
			case 3: 
				System.out.println("3입니당"); 
				break;
			case 4: 
				System.out.println("4입니당"); 
				break;
			case 5: 
				System.out.println("5입니당");
				break;
			case 6: 
				System.out.println("6입니당");
				break;
			default:System.out.println("오류 입니당.");
		}
	}

}
