
public class IfElseIfChain {

	public static void main(String[] args) {
		int tablesOccupied = 24;

		if (tablesOccupied > 20) {
			System.out.println("The restaurant is very busy.");
			tablesOccupied = 12;
			
		}
		else if (tablesOccupied == 12) {
			System.out.println("The restaurant is moderately busy.");

		} else {
			System.out.println("The restaurant is not busy.");
		}

	}

}
