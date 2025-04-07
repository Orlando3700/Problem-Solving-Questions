//How would you swap two numbers without using a third variable?
//The idea is to get a sum in one of the two given numbers.
//The numbers can then be swapped using the sum and subtraction
//from the sum. 

public class SwapNumbers {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		System.out.println("Before Swapping: " + "x = " + x + " y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping: " + "x = " + x + " y = " + y);

	}

}
