import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAccount bobAccount = new BankAccount("Bob Account", 100);
		BankAccount SallyAccount = new BankAccount("Sally Account", 200);
		
		System.out.println("Current balance in " + bobAccount.name + ": " + bobAccount.balance);
		System.out.println("Enter the amount would you like to withdraw from " + bobAccount.name + ":");
		double withdrawn = bobAccount.withdraw(input.nextDouble());
		
		System.out.println("===========================");
		System.out.println("You have withdrawn: " + withdrawn);
		System.out.println("Updated balance for " + bobAccount.name + ":  " + bobAccount.balance);
		
		input.close();
	}

}
