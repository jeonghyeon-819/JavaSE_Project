package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

// extends Object 이건 생략되어 있음
public class Account extends Object {
	private String custId;
	private String accId;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String custId, String accId, int balance) {
		this.custId = custId;
		this.accId = accId;
		this.balance = balance;
	}
	
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
		this.balance += amount;
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			// Exception을 강제로 발생시킴
			throw new InsufficientBalanceException("잔액이 부족합니다. 현재 잔액은 = ", this.balance); 
		}
		
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [custId=" + custId + ", accId=" + accId + ", balance=" + balance + "]";
	}

	
}
