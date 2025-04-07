//How do you get the matching elements in an integer array?
//Below is an example of how to declare an array in Java 
//and use nested loops to compare its elements. 
//If a matching element is found, it will be printed.

public class MatchingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 1};
		
        // Loop through each element in the array
		for (int i = 0; i < numbers.length; i++) {
		for (int j = i + 1; j < numbers.length; j++) {
			if (numbers[i] == numbers[j]) {
				System.out.println("Matching elements found: " + numbers[i]);
				break; // Exit the inner loop once a match is found
			}
		}
	}
}
}

//In the nested loop, I initialized int j = i + 1 to 
//avoid comparing an element with itself and to ensure
//that each pair of elements is only compared once