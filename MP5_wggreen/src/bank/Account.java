package bank;

import java.time.LocalDate;

public abstract class Account {
	private String accountNo;
	private double balance;
	private LocalDate dateCreated;

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.dateCreated = LocalDate.now();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Account\nAccount No: " + accountNo
		+ String.format("\nAccount Balance: $%.2f", balance)
		+ "\nDate Created: " + dateCreated
		+ "\n";
	}

	public abstract void withdraw(double amount);

	public abstract void deposit(double amount);

}
