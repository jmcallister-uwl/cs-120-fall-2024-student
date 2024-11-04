
public class Demo {

	public static void main(String[] args) {
		BankAccount accountA = new BankAccount("123", 100);
		BankAccount accountB = new BankAccount("456", 200);
		
		/*********************************************************
		 * **************** TESTING ACCOUNT CREATION *************
		 * *******************************************************/
		
//		double amount = accountA.withdraw(30);
//		System.out.println(accountA.getAccountNumber() + " balance: " + accountA.checkBalance());
//		System.out.println("amount: " + amount);
		
		/*********************************************************
		 * *******************************************************
		 * *******************************************************/
		
		/*********************************************************
		 * **************** TESTING BANK CREATION *************
		 * *******************************************************/

		Bank bankOne = new Bank("Altra", 4);
		System.out.println(bankOne.getName() + " size: " + bankOne.getAccountList().length);
		System.out.println("=======================================");
		System.out.println(bankOne.getName() + " BEFORE adding account:");
		bankOne.printAccounts();
		
		
		/*
		 * ******* TESTING ADDING *SINGLE* ACCOUNT TO BANK ********
		 * */
		
		bankOne.addAccount(accountB);
		System.out.println("=======================================");
		System.out.println(bankOne.getName() + " AFTER adding account:");
		bankOne.printAccounts();
		/*
		 * *****************************************************
		 * */
		
		
		/*********************************************************
		 * *******************************************************
		 * *******************************************************/
		
		
		/*********************************************************
		 * ******* TESTING BANK CREATION & ARRAY MANIPULATION ****
		 * *******************************************************/
		
//		BankAccount[] accountList = { accountA };
//		Bank bankTwo = new Bank("Wells Fargo", accountList);
//		
//		System.out.println("1) Printing " + bankTwo.getName() + " Accounts:");
//		bankTwo.printAccounts();
				
		/*
		 * ************* TESTING ACCOUNTEXISTS() **************
		 * */
		
//		boolean wasFound = bankTwo.accountExists(accountA.getAccountNumber());
//		System.out.println("account exists: " + wasFound);
//		bankTwo.printAccounts();
		
		/*
		 * *****************************************************
		 * */
		
		
//		accountList[0] = accountB;
//		accountList[0].deposit(124);
//		
//		System.out.println("================================");
//		System.out.println("\n2) Printing " + bankTwo.getName() + " Accounts:");
//		bankTwo.printAccounts();
		
		/*********************************************************
		 * *******************************************************
		 * *******************************************************/
		
		
		
	}

}
