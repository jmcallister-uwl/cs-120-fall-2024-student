
public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNum) {
		this.accountNumber = accountNum;
	}

	public BankAccount(String accountNum, double accountBalance) {
		this.accountNumber = accountNum;
		this.balance = accountBalance;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) {
		double amountWithdrawn = 0;
		if(this.balance >= amount) {
			this.balance -= amount;
			amountWithdrawn = amount;
		}
		
		return amountWithdrawn;
	}
	
	public double checkBalance() {
		return this.balance;
	}
}










