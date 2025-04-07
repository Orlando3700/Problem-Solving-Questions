
public class Practise {

		
		int binarySearch(int array[], int high, int low, int x) {
		
		if (high >= low) {
		
		int mid = low + (high - low)/2;
		
		if (array[mid] == x)
			return mid;
			
			if (array[mid] > x)
			return binarySearch(array, mid - 1, low, x);
			
			if (array[mid] < x)
			return binarySearch(array, high, mid+1, x);
			
		}
return -1;
		}
		
		// Driver code
	    public static void main(String args[])   {

	    }
	    }