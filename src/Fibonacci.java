//The Fibonacci sequence is a sequence where the next term is 
//the sum of the previous two terms. The first two terms of 
//the Fibonacci sequence are 0 followed by 1. The Fibonacci 
//sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

public class Fibonacci {
	
	// recursion
	static int nthFibonacci(int n) {
		if (n <= 1) { // Base case: if n is 0 or 1, return n
			return n;
		}
		
		// Recursive case: sum of the two preceding
        // Fibonacci numbers
		return nthFibonacci(n - 1) + nthFibonacci(n - 2);

	}

	public static void main(String[] args) {
		int n = 10;
		int result = nthFibonacci(n);
		System.out.println(result);

	}

}
