import java.util.Scanner;

public class ElaborateCoffee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String coffeeBase = "";
		String milk = "";
		String size = "";
		String extras = "";

		System.out.println("What coffee base would you like? (Espresso, Black, Latte):");
		coffeeBase = input.nextLine();

		if (coffeeBase.equalsIgnoreCase("latte")) {
			System.out.println("What kind of milk would you like? (Whole, Skim, Almond):");
			milk = input.nextLine();
		}

		System.out.println("What size would you like? (Small, Medium, Large):");
		size = input.nextLine();

		System.out.println("What extras would you like extras? (Sugar, Cinnamon):");
		extras = input.nextLine();

		if (!milk.isEmpty()) {
			System.out.println("Your order is a " + size + " " + coffeeBase + " with " + milk + " and " + extras);

		} else {
			System.out.println("Your order is a " + size + " " + coffeeBase + " with " + extras);
		}

		input.close();

	}

}
