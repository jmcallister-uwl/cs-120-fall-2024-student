
public class BankAccount {
	public String name;
	public double balance;
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	// There is a major problem here. Can you see what it is?
	public boolean transfer(BankAccount otherAccount, double amount) {
		boolean wasSuccessful = false;
		
		if(this.balance >= amount) {
			// Allow the transfer
			this.balance -= amount;
			otherAccount.balance += amount;
			
			// Transfer successful
			wasSuccessful = true;
		}
		
		return wasSuccessful;
	}
	
	// There is a major problem here. Can you see what it is?
	public double withdraw(double amount) {
		double withdrawnAmt = 0;
		
		if(this.balance >= amount) {
			// Can withdraw
			this.balance -= amount;
			
			// Update the withdrawn amount
			withdrawnAmt = amount;
		}
		
		return withdrawnAmt;
	}
	
}
