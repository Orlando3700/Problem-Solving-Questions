import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SmallestNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		List<Integer> list = Arrays.asList(array);
		
		System.out.println("Smallest number in the array is " +Collections.min(list));

	}

}
