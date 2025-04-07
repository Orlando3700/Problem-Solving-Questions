//How do you remove all occurrences of a given character 
//from the input string?
//Use the built-in string method “replace” to replace a 
//character with any other character, including symbols 
//and white spaces.

//How do you replace a character with another character within
//a string
//Use the replace method

public class RemoveCharacter {

	public static void main(String[] args) {
	
		String str1 = "Orlando";
		str1 = str1.replace("a", "");
		System.out.println(str1);
		
		String str2 = "Fernand";		
		str2 = str2.replace("F", "A");		
		System.out.println(str2);
		
		String s = "Angel";
		char c = 'A';
	        
		// Remove all occurrences of 'c' from 's'
	    s = s.replace(String.valueOf(c), "");

	    System.out.println(s);

	}

}
