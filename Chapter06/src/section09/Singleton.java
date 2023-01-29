package section09;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private int value;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
