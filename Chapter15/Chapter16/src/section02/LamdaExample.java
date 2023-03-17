package section02;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근...~");
			System.out.println("프로그래밍 시작...~");
		});
		
		person.action(() -> System.out.println("퇴근야~"));

	}

}
