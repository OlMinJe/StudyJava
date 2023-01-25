package section02;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // result: 2
		
		String subString = subject.substring(location);
		System.out.println(subString); // result: 프로그래밍
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군용");
		} else {
			System.out.println("자바와 관련 없는 책이군용");
		}
		
		boolean bool = subject.contains("프로그래밍");
		if(bool) {
			System.out.println("자바와 관련된 책이군용");
		} else {
			System.out.println("자바와 관련 없는 책이군용");
		}
	}

}
