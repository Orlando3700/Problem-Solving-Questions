//Find the number of occurrences of a character in a String

import java.util.Scanner;

public class NumberOfOccurrencesInString {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);		

		//Prompt user for input string
		System.out.print("Enter a String: ");
		String str = console.nextLine();
		
		//Prompt user for the character to search for
		System.out.print("Enter the character to count: ");
		char search = console.next().charAt(0);
		
		int count = countCharacterOccurences(str, search);
		
		//Display result
		System.out.println("The Character " + search + " occures " + count + " times" );		
		
		console.close();
	}

	public static int countCharacterOccurences(String str, char search) {		
		int count = 0;
				
				//Loop through the string
				for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == search) {
					count ++;
				}
			}
	return count;

}
}
