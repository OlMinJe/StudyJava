package Example01;

public class SudaCard {
	int num;
	boolean isKwang;
	
	public SudaCard() {
		//this.num = 1;
		//this.isKwang = true;
		this(1, true);
	}
	
	public SudaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	private String info() {
		String result = isKwang ? "k" :"";
		return num + result;
	}


}
