
public class Fibonacci {

	public static void main(String[] args) {
		long numFibonacciTerms = 50;
        long first = 0;
        long second = 1;

        // Declaring and initializing here so as to not have
        // the computer re-declare on every loop iteration.
        long next = 0;
        
        System.out.print("Fibonacci Sequence: " + first + ", " + second);
        
        // Starting loop at 2 because we already have the first and second number in
        // the variables "first" and "second", respectively.
        for (int i = 2; i < numFibonacciTerms; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

	}

}
