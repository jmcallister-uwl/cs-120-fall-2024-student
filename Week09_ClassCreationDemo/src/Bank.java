
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

	public void setAccountList(BankAccount[] accountList) {
		this.accountList = accountList;
	}

	public int getNextOpenIndex() {
		return nextOpenIndex;
	}

	public void setNextOpenIndex(int nextOpenIndex) {
		this.nextOpenIndex = nextOpenIndex;
	}

	public boolean addAccount() {
		return false;
	}
	
	public boolean transfer(BankAccount accTransferFrom, BankAccount accTransferTo, double amount) {
		
		return false;
	}
	
	public boolean accountExists(String accountNumber) {
		
		return false;
	}
	
	public void printAccounts() {
		
	}
}









