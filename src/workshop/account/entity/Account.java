package workshop.account.entity;

public class Account {
	private String custId;
	private String accId;
	private int balance;

	// Method 선언
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		// this.balance = this.balance + amount;
		this.balance += balance;
	}
	
	public void withdraw(int amount) {
		this.balance -= balance;
	}

}
