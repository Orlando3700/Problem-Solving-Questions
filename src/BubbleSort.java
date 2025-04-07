//Start
//Initiate two values n as size of array ,also i and j to traverse array.
//Put i=0 and j=1.
//While traversing if array[i] > array[j] swap both the numbers.
//Increment the value i and j then goto Step 3.
//If the value of i > n-1 and j > n and n>1 then
//n=n-1
//goto Step 2
//Exit

public class BubbleSort {
	
	static void bubbleSort(int array[]) {
		
		int n = array.length;
		
		for (int i = 0; i < n - 1; i++)
			for(int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					
					//Swap temp and array[j]
					int temp = array[j];
					array[j + 1] = temp;
				}
	}
	// Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = { 64, 34, 25, 12 };
      
        ob.bubbleSort(a);
      
          int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

