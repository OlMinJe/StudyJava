package exam.bank;

public class Account {
	private String accountNumber;
	private String Name;
	private int balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
	}
	
}
