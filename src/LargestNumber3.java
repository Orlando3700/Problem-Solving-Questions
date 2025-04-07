import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber3 {

	public static void main(String[] args) {
		
		//Sample Array
		Integer[] array = {1, 2, 3, 4, 5, 6};
		
		//Convert array to a list
		List<Integer> List = Arrays.asList(array);
		
		System.out.println(Collections.max(List));

	}

}
