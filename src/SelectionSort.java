
public class SelectionSort {

	public static void selectionSort(int array[]) {
		int n = array.length;
		
		//initializes a loop that will iterate from the 
		//first element of the array to the second-to-last
		//element. This loop is used to select the current 
		//position to be filled with the smallest unsorted element.
		for (int i = 0; i < n - 1; i++) {
		
		// Find the minimum element in unsorted array
		int min_index = i;
		
		// Iterate through the unsorted portion
        // to find the actual minimum
		for (int j = i + 1; j < n; j++) {
			if (array[j] < array[min_index]) {
			
				// Update min_index if a smaller element is found
				min_index = j;
			}
		}
		
		// Move minimum element to its correct position
		int temp = array[i]; //stores the value at the current index i in a temporary variable
		array[i] = array[min_index]; //assigns the minimum element to the current index i
		array[min_index] = temp; //assigns the value stored in temp to the position min_index.
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
