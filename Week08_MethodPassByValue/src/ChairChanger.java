
public class ChairChanger {
	// By being private, this class cannot be instantiated
	private ChairChanger() {}
	
	/* 
	 * What would you expect the variable in the main() method
	 * which was passed in for "heightOne" here to be after this method call?
	 */
	public static int addMeasurements(int heightOne, int heightTwo) {
		int result = heightOne + heightTwo;		
		heightOne = 8;
		
		return result;
	}
	
	/* 
	 * What would you expect the variable in the main() method
	 * which was passed in for "material" here to be after this method call?
	 */ 
	public static void materialTest(String material) {
		material = "test";
	}
	
	/* 
	 * What would you expect the variable in the main() method
	 * which was passed in for "chair" here will have its "material" property
	 * after this method call?
	 */
	public static void changeMaterial(Chair chair, String newMaterial) {
		chair.material = newMaterial;
	}
	
	/* 
	 * What would you expect the variable in the main() method
	 * which was passed in for "chair" here will have its "color" property
	 * after this method call?
	 */
	public static void changeColor(Chair chair, String color) {
		chair.color = color;		
	}
	
	public static void changeHeight(Chair chair, int newHeight) {
		// make sure height is valid
		if(newHeight > 0) {
			// change height of chair passed
			chair.height = newHeight;
		}

	}
}
