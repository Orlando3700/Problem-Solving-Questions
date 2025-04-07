
public class SmallestNumber {

	public static void main(String[] args) {
        // Initialize array
        int[] array = {25, 11, 23, 58, 68, 98};

        // Initialize min with the first element in the array
        int min = array[0];

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) { // Change > to <
                min = array[i]; // Update min if a smaller value is found
            }
        }
        System.out.println("Smallest number in the array is: " + min);
    }
}