
public class Demo {

	public static void main(String[] args) {
		BankAccount accountA = new BankAccount("123", 100);
//		BankAccount accountB = new BankAccount("456", 200);

		
		double amount = accountA.withdraw(-20);
		System.out.println(accountA.getAccountNumber() + " balance: " + accountA.checkBalance());
		System.out.println("amount: " + amount);
		
		
//		BankAccount[] accountList = { accountA };
		
//		accountList[0] = accountB;
		
		
		
		


//		Bank bankOne = new Bank("Altra", 4);
				
//		System.out.println(bankOne.getName() + " size: " + bankOne.getAccountList().length);

//		Bank bankTwo = new Bank("Wells Fargo", accountList);
		
		
	}

}
