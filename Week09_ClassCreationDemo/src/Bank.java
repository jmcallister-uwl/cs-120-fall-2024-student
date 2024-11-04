
public class Bank {
	private String name;
	private BankAccount[] accountList;
	private int nextOpenIndex;

	public Bank(String bankName, int maxNumAccounts) {
		this.name = bankName;
		this.accountList = new BankAccount[maxNumAccounts];

	}

	public Bank(String bankName, BankAccount[] bankAccounts) {
		/**
		 * this.accountList = bankAccounts;
		 */
		this.name = bankName;
//		this.accountList = bankAccounts;
		this.accountList = new BankAccount[bankAccounts.length];
		for(int i = 0; i < bankAccounts.length; i++) {
			this.accountList[i] = bankAccounts[i];
		}
		
		this.nextOpenIndex = this.accountList.length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount[] getAccountList() {
		return accountList;
	}

	/**
	 * Can we use this method elsewhere?
	 */
	public void setAccountList(BankAccount[] accountList) {
		this.accountList = accountList;
	}

	public int getNextOpenIndex() {
		return nextOpenIndex;
	}

//	public void setNextOpenIndex(int nextOpenIndex) {
//		this.nextOpenIndex = nextOpenIndex;
//	}

	public boolean addAccount(BankAccount account) {
		boolean wasAdded = false;
		// If there is room in the bank.
		// And if the account is not already in the bank.
		if(this.nextOpenIndex < this.accountList.length 
				&& !this.accountExists(account.getAccountNumber())) {
			// add account
			this.accountList[this.nextOpenIndex] = account;
			this.nextOpenIndex++;
			wasAdded = true;
		}
		
		return wasAdded;
	}

	public boolean transfer(BankAccount accTransferFrom, BankAccount accTransferTo, double amount) {

		return false;
	}

	public boolean accountExists(String accountNumber) {
		boolean wasFound = false;
		for (int i = 0; i < this.nextOpenIndex; i++) {
			BankAccount curAccount = this.accountList[i];
			if (curAccount.getAccountNumber().equals(accountNumber)) {
				wasFound = true;
				break;
			}
		}

		return wasFound;
	}

	public void printAccounts() {
		for (int i = 0; i < this.nextOpenIndex; i++) {
			BankAccount curAccount = this.accountList[i];			
			
			System.out
					.println("Account Num " + curAccount.getAccountNumber() + " balance: " + curAccount.checkBalance());
		}
	}
}
