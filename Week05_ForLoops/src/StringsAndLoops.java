
public class StringsAndLoops {

	public static void main(String[] args) {
		String phrase = "Hello World";			
		
		/**
		 * TODO: 
		 * Start in middle of the string, iterate backwards,
		 * get a count of how many of a certain character there is.
		 * */
		
		char target = 'l';
		int count = 0;
		
		for(int i = phrase.length() / 2; i >= 0; i--) {
			if(phrase.charAt(i) == target) {
				count++;
			}
		}
		
		System.out.println("Total " + target + " in first half of " + phrase + " => " + count);
			
			
	}

}





