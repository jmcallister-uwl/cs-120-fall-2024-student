
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
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) {
		double withdrawnAmount = 0;
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			withdrawnAmount = amount;			
		}
		
		return withdrawnAmount;
	}
	
	public double checkBalance() {
		return this.balance;
	}
}










