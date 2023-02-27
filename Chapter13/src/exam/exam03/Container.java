package exam.exam03;

public class Container<S, I> {
	S value1;
	I value2;
	
	public void set(S value1, I value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public S getKey() {
		return value1;
	}
	
	public I getValue() {
		return value2;
	}
}
