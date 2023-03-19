package section05;

public class LandaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		/* 람다식
		person.action((x, y) -> Computer.staticMethod(x, y));
		/**/
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		/* 람다식
		person.action((x, y) -> com.instanceMethod(x, y));
		/**/
		person.action(com :: instanceMethod);
	}
}
