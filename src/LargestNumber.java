//Find largest number in the array

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Initialize array
		int [] array = {25, 11, 23, 58, 68, 98};
		//int [] array = new int [] {25, 11, 23, 58, 68, 98};  
		
		//Initialize max with first element in array
		int max = array[0];
		
		//Loop through the array
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max);
			max = array[i];
		}
		System.out.println("Largest number in the array is: " + max);

	}
	
}