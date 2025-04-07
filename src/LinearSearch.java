//Given an array, arr of n integers, and an integer element x, 
//find whether element x is present in the array. Return the 
//index of the first occurrence of x in the array, or -1 if 
//it doesn’t exist.

public class LinearSearch {
	
	public static int search( int array[], int N, int x) {
		for (int i = 0; i < N; i++) {
			if (array[i] == x)
				return i;
			}
			return -1;
		}
	
		//Driver code
		public static void main(String args[])
		{
			int arr[] = { 2, 3, 4, 10, 40 };
			int x = 10;

			// Function call
			int result = search(arr, arr.length, x);
			if (result == -1)
				System.out.print(
						"Element is not present in array");
			else
				System.out.print("Element is present at index "
                         	+ result);
		}
}