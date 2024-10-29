
public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNum) {
		
	}

	public BankAccount(String accountNum, double accountBalance) {
		
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) {
		return 0;
	}
	
	public double checkBalance() {
		return 0;
	}
}










