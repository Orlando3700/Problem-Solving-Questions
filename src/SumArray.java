//In Java, the += operator is called the addition assignment
//operator. It is used to add the value on the right-hand 
//side of the operator to the variable on the left-hand side, 
//and then assign the result back to the variable on the left-hand
//side.

public class SumArray {
	
	static int arr[] = { 12, 3, 4, 15 };

    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum

        // Iterate through all elements and add them to sum
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is " + sum());
    }
}

