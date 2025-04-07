import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array
		Integer [] Array = {10, 20, 30, 40, 50};
		reverse(Array);

	}

	private static void reverse(Integer[] array) {
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.asList(array));
		
	}

}
