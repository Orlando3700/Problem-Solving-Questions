
public class ReverseStrings {

	public static void main(String[] args) {
		
		String Original = "Orlando";
		String Reversed = "";

		System.out.println("Original Word = " + Original);
		
		for (int i = 0; i < Original.length(); i++) { 
			char ch = Original.charAt(i); // Extract each character
			Reversed = ch + Reversed; //adds each character in front of the existing string
			}
		
		System.out.println("Reversed word = " + Reversed);
	}
}