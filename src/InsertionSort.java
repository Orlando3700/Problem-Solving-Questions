
public class InsertionSort {
	
	public static void insertionSort(int array[]) {
		int n = array.length;
				for (int i = 0; i < n; i++) {
					
					//The current element at index i is stored in the
					//variable key. This is the element we want to 
					//insert into the sorted portion of the array.
					int key = array[i];
					
					//A new variable j is initialized to i - 1. This
					//will be used to compare elements in the sorted
					//portion of the array.
					int j = i - 1;
				
					//This starts a while loop that continues as long
					//as j is greater than or equal to 0 and the 
					//element at array[j] is greater than key. This
					//checks where key should be inserted in the sorted
					//portion.
					while (j >= 0 && array[j] > key) {
						
						//If the condition of the while loop is true,
						//this line shifts the element at array[j] 
						//one position to the right, making space for 
						//key.
						array[j + 1] = array[j];
						
						//The value of j is decremented to move to the
						//next element in the sorted portion of the 
						//array.
						j = j - 1;
					}
					
					//After finding the correct position for key, this
					//line inserts it into the array at array[j + 1], 
					//which is where the last comparison showed it 
					//should go.
					array[j + 1] = key;
					}
				}
	
	/* A utility function to print array of size n */
    public static void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int array[] = { 12, 11, 13, 5, 6 };

        InsertionSort object = new InsertionSort();
        object.insertionSort(array);

        printArray(array);
    }
}

