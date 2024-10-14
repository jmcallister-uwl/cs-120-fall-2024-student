
public class SwappingElements {

	public static void main(String[] args) {
		String[] wordList = {"apple", "banana", "cherry", "date", "elderberry", "fruits"};
		
		System.out.println("=================== ARRAY ** BEFORE ** REVERSAL ================= ");
		for(int i = 0; i < wordList.length; i++) {
			System.out.println("wordList[" + i + "]: " + wordList[i]);
		}
		
		System.out.println("=========================================================== ");

		
		/****************************************************************************
		 * ******************** MULTIPLE LOOP VARIABLES REVERSE ARRAY ******************
		 ***************************************************************************/
		
		/**
		 * We have one variable starting at beginning and working towards the end.
		 * We have another variable starting at the end, and working towards the beginning.
		 * When these two variables meet each other, i becomes >= to j, then we want to stop.
		 * 
		 * TODO: 
		 * 			See what happens when you make the conditional be
		 * 			i != j. Then see what happens when you have
		 * 			an *even* number of elements in the array. You
		 * 			will see why we need i <= j rather than i != j.
		 * 			Notice that the case where we have an even number
		 * 			of elements in the array will work fine with the conditional
		 * 			as i != j, but when we have an odd number of elements in the
		 * 			array, then the i != j conditional will not work. However,
		 * 			the i <= j conditional will always work.
		 * */
		for(int i = 0, j = wordList.length - 1; i <= j; i++, j--) {
			// Hold value at beginning
			String temp = wordList[i];
			
			// Swap beginning value for ending value
			wordList[i] = wordList[j];
			// Use temp variable to place what was at beginning to the end.
			wordList[j] = temp;				
		}
		
		
		/****************************************************************************
		 ***************************************************************************/
		
		/****************************************************************************
		 * ******************** ADVANCED APPROACH REVERSE ARRAY ******************
		 ***************************************************************************/		
		
//		for(int i = 0; i < wordList.length / 2; i++) {
//			// Temporary holding variable
//			String word = wordList[i];
//			
//			// TODO: Uncomment below to see how we start from end and work forward.
////			System.out.println(wordList[ (wordList.length -1) - i] );
//			
//			wordList[i] = wordList[ (wordList.length -1) - i ];
//			wordList[ (wordList.length -1) - i ] = word;					
//		}
		
		/****************************************************************************
		 ***************************************************************************/
		
		
		System.out.println("=================== ARRAY ** AFTER ** REVERSAL ================= ");
		for(int i = 0; i < wordList.length; i++) {
			System.out.println("wordList[" + i + "]: " + wordList[i]);
		}
		
		System.out.println("=========================================================== ");

	}

}
