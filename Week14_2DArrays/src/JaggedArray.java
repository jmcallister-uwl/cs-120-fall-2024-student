
public class JaggedArray {

	public static void main(String[] args) {
		int[][] jaggedArray = {
			    { 1, 2, 3 },         // Row 0 has 3 elements
			    { 4, 5 },            // Row 1 has 2 elements
			    { 6, 7, 8, 9 },      // Row 2 has 4 elements
			    { 10 }               // Row 3 has 1 element
			};
		
		for(int row = 0; row < jaggedArray.length; row++) {

		    for(int column = 0; column < jaggedArray[row].length; column++) {
					System.out.print(jaggedArray[row][column] + " ");
		    }
		    System.out.println();
		    
		}

	}

}
