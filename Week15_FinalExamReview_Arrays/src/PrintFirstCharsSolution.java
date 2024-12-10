public class PrintFirstCharsSolution {

	public static void main(String[] args) {
		/*
		 * This main() method shows example use of printFirstChars
		 * */
		
		String[] words = {"apple", "blueberry", "cherry", "date"};
		
		String result = printFirstChars(words);
		
		System.out.println(result);
		
	}
	
	// Solution code from Notion
	public static String printFirstChars(String[] container){
		String firstChars = "";
		
		for(int i = 0; i < container.length; i++){
			firstChars += container[i].charAt(0);
		}
		
		return firstChars;
	}

}