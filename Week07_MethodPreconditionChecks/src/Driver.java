
public class Driver {

	public static void main(String[] args) {
		BankAccount bobAccount = new BankAccount("Bob Account", 100);
		BankAccount SallyAccount = new BankAccount("Sally Account", 200);
		
		System.out.println(bobAccount.name + " balance before withdraw: " + bobAccount.balance);
		double withdrawn = bobAccount.withdraw(20);
		
//		System.out.println("===========================");
//		System.out.println(withdrawn);
//		System.out.println(bobAccount.name + " balance after withdraw: " + bobAccount.balance);

	}

}
