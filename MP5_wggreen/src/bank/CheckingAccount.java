package bank;

public class CheckingAccount extends Account {

	private double overdraftLimit;

	public CheckingAccount(String accountNo, double balance, double overdraftLimit) {
		super(accountNo, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {
		if ((amount - this.getBalance()) > overdraftLimit) {
			System.out.println("\nRejected. Insufficent funds and overdrawn.\n");
		} else {
			this.setBalance(this.getBalance() - amount);
		}
	}

	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}

	@Override
	public String toString() {
		return "CheckingAccount\nAccount No: " + this.getAccountNo()
		+ String.format("\nAccount Balance: $%.2f", this.getBalance())
		+ "\nDate Created: " + this.getDateCreated()
		+ String.format("\nOverdraft Limit: $%.2f", overdraftLimit)
		+ "\n";
	}

}
