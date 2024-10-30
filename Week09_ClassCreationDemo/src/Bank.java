
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
		 * */
		this.name = bankName;
		this.accountList = bankAccounts;
		this.nextOpenIndex = bankAccounts.length;
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
	 * */
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
		// if room in bank and 
		// if account is not in bank already
		if(this.accountList.length > this.nextOpenIndex &&
				!this.accountExists(account.getAccountNumber())) {
			// we have room & account not in bank already
			// add bank account
			this.accountList[this.nextOpenIndex] = account;
			wasAdded = true;
			this.nextOpenIndex++;
		}
		
		return wasAdded;
	}
	
	public boolean transfer(BankAccount accTransferFrom, BankAccount accTransferTo, double amount) {
		
		return false;
	}
	
	public boolean accountExists(String accountNumber) {
		boolean wasFound = false;
		for(int i = 0; i < this.accountList.length; i++) {
			BankAccount account = this.accountList[i];
			if(account.getAccountNumber().equals(accountNumber)) {
				wasFound = true;
			}			
		}
		
		return wasFound;
	}
	
	public void printAccounts() {
		for(int i = 0 ; i < this.accountList.length; i++) {
			BankAccount account = this.accountList[i];
			System.out.println("Account Num " + 
								account.getAccountNumber() +
								" balance: " + account.checkBalance() 
					);
		}
	}
}









