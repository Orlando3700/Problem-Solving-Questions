import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LargestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {26, 27, 39, 47, 69, 27, 49, 37};
		
        // Creating new List
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		System.out.println("Largest in given array is : " + Collections.max(list));
		
		//If you want the minimum number in the array
		//System.out.println("Largest in given array is : " + Collections.min(list));
		//You can't put reverse here
	}

}
