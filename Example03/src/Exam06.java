// 이거 좀 헷갈림
public class Exam06 {

	public static void main(String[] args) {
		int num = 24;
		int drainage; 
		
		/*
		if (num%10 != 0) {
			drainage = num - num%10 + 10;
		} else {
			drainage = num + 10;
		}
		System.out.println(drainage - num);
		/**/
		
		System.out.println(10 - num%10);
		
	}

}
