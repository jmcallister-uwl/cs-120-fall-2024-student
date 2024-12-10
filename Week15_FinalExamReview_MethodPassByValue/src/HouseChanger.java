
public class HouseChanger {
	// By being private, this class cannot be instantiated
	private HouseChanger() {}

	/*
	 * What would you expect the variable in the main() method which was passed in
	 * for "heightOne" here to be after this method call?
	 */
	public static int addMeasurements(int heightOne, int heightTwo) {
		int result = heightOne + heightTwo;
		heightOne = 8;

		return result;
	}

	/*
	 * What would you expect the variable in the main() method which was passed in
	 * for "material" here to be after this method call?
	 */
	public static void materialTest(String material) {
		material = "brick";
		
	}

	/*
	 * What would you expect the variable in the main() method which was passed in
	 * for "house" here will have its "color" property after this method call?
	 */
	public static void paintHouse(House house, String newColor) {
		house.color = newColor;
		
	}

	public static void changeHeight(House house, int newNumDoors) {
		// make sure numDoors is valid
		if (newNumDoors >= 0) {
			// change height of house passed
			house.numDoors = newNumDoors;
		}
	}
	
}
