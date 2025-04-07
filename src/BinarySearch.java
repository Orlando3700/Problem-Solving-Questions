// Java implementation of
// recursive Binary Search

public class BinarySearch {
	
	// low is the lower index. high is the upper index
	// x is the value to look for
	int binarySearch(int array[], int low, int high, int x) {
		
		// Returns index of x if it is present in arr[l..
	    // r], else return -1
		//condition checks if the search range is valid
		//(i.e., the high index is not less than the low index)
		if (high >= low) {
			
			//calculates the midpoint index of the current search range
			int mid = low + (high - low) / 2;
			
			// If the element is present at the
            // middle itself
			if (array[mid] == x)
				return mid;
			
			// If element is smaller than mid, then
            // it can only be present in left subarray
			if (array[mid] > x)
				return binarySearch(array, low, mid - 1, x);
			
			// Else the element can only be present
            // in right subarray
			if (array[mid] < x)
				return binarySearch(array, mid + 1, high, x);
			
			}
		// We reach here when element is not present
        // in array
		return -1;
		}
	
	// Driver code
    public static void main(String args[])   {
    	
    	//create a new instance of binary search
    	BinarySearch object = new BinarySearch();
    	int array[] = { 2, 4, 7, 8, 9, 10, 38, 94};
    	int n = array.length;
    	int x = 10;
    	int result = object.binarySearch(array, 0, n-1, x);
    	
    	if (result == -1)
    		System.out.println("Element is not present in the array");
    	else System.out.println("Element is present at : " +result);
		
    }
    
}

