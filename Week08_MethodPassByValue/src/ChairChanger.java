
public class ChairChanger {
	// By being private, this class cannot be instantiated
	private ChairChanger() {}
	
	public static int addMeasurements(int heightOne, int heightTwo) {
		int result = heightOne + heightTwo;		
		heightOne = 8;
		
		return result;
	}
	
	public static void materialTest(String material) {
		material = "test";
	}
	
	public static void changeMaterial(Chair chair, String newMaterial) {
		chair.material = newMaterial;
	}
	
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
