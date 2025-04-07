import java.util.Arrays;
import java.util.Collections;

public class ReverseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Collections.reverse(Arrays.asList(Array));
		System.out.println(Arrays.asList(Array));
		
		//Arrays.asList Compatibility: The method Arrays.asList()
		//is designed to work with object arrays, not primitive 
		//arrays. When you pass an int[], it doesn't convert the 
		//array to a list of integers; instead, it treats the entire
		//array as a single object. This means you would end up with
		//a list containing one element (the array itself), rather 
		//than a list of individual integers.

		//Wrapper Class Requirement: When working with collections 
		//(like List or methods from the Collections class), Java 
		//requires object types. The Integer class can hold null 
		//values and provides methods for manipulation, while int 
		//is a primitive type that does not.

	}

}
