
public class Demo {

	public static void main(String[] args) {
		System.out.println("\n========= Example 1: Pass-by-value with primitives ====================\n");
		
		int firstHeight = 12;
		int secondHeight = 2;
		
		int result = ChairChanger.addMeasurements(firstHeight, secondHeight);
		
		System.out.println("Result of addMeasurements: " + result);
		System.out.println("firstHeight AFTER addMeasurements: " + firstHeight);
		
		System.out.println("\n==================================================================");

		
		System.out.println("\n========= Example 2: Pass-by-value with object references ====================\n");
		
		Chair officeChair = new Chair("metal", "orange", 12);
		System.out.println("Original material of officeChair: " + officeChair.material);
		
		ChairChanger.changeMaterial(officeChair, "wood");
		
		System.out.println("Material of officeChair after changeMaterial: " + officeChair.material);	
		
		System.out.println("\n==================================================================");
		
		
		System.out.println("\n========= Example 3: Method scope and local variables ====================\n");
		
		String matOne = "copper";
	
		ChairChanger.materialTest(matOne);
		
		System.out.println("matOne after materialTest: " + matOne);
		
		System.out.println("\n==================================================================");
		
		System.out.println("\n========= Example 4: Reference comparison ====================\n");

		Chair testChair = officeChair;
		System.out.println("officeChair and testChair refer to the same object: " + (officeChair == testChair));
		
		System.out.println("\n==================================================================");
	}

}
