//Merge Sort Algorithm
//There are only five steps to understand Merge Sort Algorithm:

//Step 1: Divide Array into Two Parts.
//Step 2: Merge Sort the first part of the array.
//Step 3: Merge Sort the second part of the array.
//Step 4: Merge Both the parts.
//Step 5: Return the Sorted Array

public class MergeSort {
	
	static void merge(int array[], int l, int m, int r) {
		
		//Find sizes of two subarrays to be merged
		
		//int n1 = m - l + 1;
		//This line calculates the size (number of elements)
		//of the left subarray, which is the portion of the 
		//array between indices l and m
		
		//The subarray starts at index l and ends at index m 
		//(inclusive). So, the number of elements in this subarray
		//is the difference between the indices m and l, plus one
		//(because both indices are inclusive).
		
		int n1 = m - l + 1;
		
		//int n2 = r - m;
		//This line calculates the size (number of elements) of the
		//right subarray, which is the portion of the array between
		//indices m+1 and r (inclusive).

		//The right subarray starts at index m+1 and ends at index r.
		//The size of the subarray is simply the difference between
		//the indices r and m because r - m gives the number of 
		//elements from index m+1 to r.
		
		int n2 = r - m;
		
		//Create Temporary Arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//Copy data to temporary arrays
		for (int i = 0; i < n1; i++)
			L[i] = array[l + i];
		
		for (int j = 0; j < n2; j++)
			R[j] = array[m + 1 + j];
		
		//Merge the temporary arrays
		
		//Initial indices of first and second arrays
		int i = 0, j = 0;
		
		//Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elements of L[] if any
		while(i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		
		//Copy remaining elements of R[] if any
		while(j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
	
	// Main function that sorts a[l..r] using
    // merge()
    void sort(int a[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(a, l, m);
            sort(a, m + 1, r);

            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int a[] = { 12, 11, 13, 5, 6, 7 };

        // Calling of Merge Sort
        MergeSort ob = new MergeSort();
        ob.sort(a, 0, a.length - 1);

        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
    }
}

