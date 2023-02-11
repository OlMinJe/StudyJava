package section01;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException { // 호출한 곳으로 예외 보내버림
		if(balance < money) {
			throw new InsufficientException("잔고 부족: " + (money - balance) + "모자람"); // 예외 발생
		}
	}
}
