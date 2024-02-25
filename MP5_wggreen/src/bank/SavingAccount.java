package bank;

public class SavingAccount extends Account {
	public static final double annualInterestRate = 0.02;
	public static final double monthlyFee = 10;
	private double minDeposit;

	public SavingAccount(String accountNo, double balance, double minDeposit) {
		super(accountNo, balance);
		this.minDeposit = minDeposit;
	}

	public double getMinDeposit() {
		return minDeposit;
	}

	public void setMinDeposit(double minDeposit) {
		this.minDeposit = minDeposit;
	}

	public static double getAnnualinterestrate() {
		return annualInterestRate;
	}

	public static double getMonthlyfee() {
		return monthlyFee;
	}
	
	public void withdraw(double amount) {
		if (amount > this.getBalance()) {
			System.out.println("\nRejected. Insufficient funds and overdrawn.\n");
		}
		else {
			this.setBalance(this.getBalance() - amount);
		}
	}
	
	public void deposit(double amount) {
		if (amount < minDeposit) {
			System.out.println("\nRejected. Deposit is less than the minimum acceptable deposit.\n");
		}
		else {
			this.setBalance(this.getBalance() + amount);
		}
	}

	@Override
	public String toString() {
		double balanceAfterFee = (this.getBalance() + ((annualInterestRate / 12) * this.getBalance())) - monthlyFee;
		return "Checking Account\nAccount No: " + this.getAccountNo()
		+ String.format("\nAccount Balance: $%.2f", this.getBalance())
		+ "\nDate Created: " + this.getDateCreated()
		+ String.format("\nAnnual Interest Rate: %.2f%%", annualInterestRate * 100)
		+ String.format("\nMonthly Fee: $%.2f", monthlyFee)
		+ String.format("\nMinimum Deposit Amount: $%.2f", minDeposit)
		+ String.format("\nNew Balance will be:: $%.2f", balanceAfterFee)
		+ "\n";
	}
	
	

}
