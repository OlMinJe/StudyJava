package section04;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// 정적 메소드일 경우
		person.action((x,y) -> {
			double result = x + y;
			return result;
		});
		
		person.action((x, y) -> x + y);
		
		person.action((x, y) -> sum(x, y));
	}
	
	public static double sum(double x, double y) {
		return x + y;
	}
}
