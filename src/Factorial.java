//How do you find the factorial of an integer?
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(5));

	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);		
	}
	
}
