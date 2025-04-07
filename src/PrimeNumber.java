//A prime is a natural number greater than 1 that has no 
//positive divisors other than 1 and itself. For example 
//2, 3, 5, 7, 11,….. are prime numbers.

//A simple solution is to iterate through all numbers from 
//2 to n / 2 and for every number check if it divides n. 
//If we find any number that divides, we return false. 

public class PrimeNumber {
	
	static boolean isPrime(int n) {
		
		if (n <= 1)
			return false;
		
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;
		
		return true;
	}

	public static void main(String[] args) {
		
		if (isPrime(11))
		System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(15))
		System.out.println(" true");
		else
			System.out.println(" false");
	}

}
