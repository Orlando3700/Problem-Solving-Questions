import java.util.Arrays;

public class SumArray1 {
	public static void main(String[] args) {
        int[] arr = {12, 3, 4, 15};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of given array is " + sum);
    }

}
