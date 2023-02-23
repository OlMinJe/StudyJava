package example;

public class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE;

	UnsupportedFuctionException(String message) {
		this(message, 100);
	}

	UnsupportedFuctionException(String message, int err_code) {
		super(message);
		this.ERR_CODE = 100;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}