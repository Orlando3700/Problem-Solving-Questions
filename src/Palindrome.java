//1) First, we take the String input from the user.
//2) Then we create the Stringbuilder object “str1″and store the value
//of String in it.
//3) The reverse() method in Stringbuider give us the reverse String. 
//Ee store that reverse String in “str1”.
//4) With the help of equals() method we compare the value’s of the 
//string, with the help of if and else condition check the string 
//value are similar or not.

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "Orlando";
		
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		
		if (str.equals(str1.toString())) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Is not Palindrome String");
				
		}

	}

}
