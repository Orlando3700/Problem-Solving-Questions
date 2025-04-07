import java.util.Arrays;

//The idea is that if the strings are anagrams, then their characters
//will be the same, just rearranged. Therefore, if we sort the 
//characters in both strings, the sorted strings will be identical
//if the original strings were anagrams. We can simply sort the 
//two given strings and compare them – if they are equal, then the
//original strings are anagrams of each other.

public class Anagram {
	
	static boolean areAnagrams(String s1, String s2) {
		
		//sort both strings
		char[] s1Array = s1.toCharArray();
		
		//toCharArray converts a string to a new character array
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		//Returns true if the two arrays of chars are equal to one another
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		String s1 = "Orlando";
		String s2 = "odnalro";
		System.out.println(areAnagrams(s1, s2));

	}

}
