import java.util.Arrays;

//Find the largest number in the array
public class LargestNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 12,   45,  67,  89,  100, 23,
                3456, 897, 452, 444, 899, 700 };
     
		// Sorting function using
		// Sort function
		Arrays.sort(array);
 
		// After sorting, the largest number is the last element 
		// of the sorted array, which is accessed using 
		// array[array.length - 1]
		// Printing the Result
		System.out.println("Largest number from given array: "+ array[array.length - 1]);

		//To find the minimum number in the array
		//System.out.println("Largest number from given array: "+ array[0]);

		//To find the minimum number in the array
		//System.out.println("Largest number from given array: "+ array[array.length - 12]);
		
		//To find the second largest number in the array
		//System.out.println("Largest number from given array: "+ array[array.length - 2]);

	}

}
