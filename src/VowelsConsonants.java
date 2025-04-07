//How do you calculate the number of vowels and consonants in a String?
//In this program, our task is to count the total number of vowels
//and consonants present in the given string.
//The characters a, e, i, o, u are known as vowels 
//Any character other than that is known as the consonant.
//To solve this problem, First of all, we need to convert 
//every upper-case character in the string to lower-case 
//so that the comparisons can be done with the lower-case 
//vowels only not upper-case vowels, i.e.(A, E, I, O, U).
//Then, we have to traverse the string using a for or while
//loop and match each character with all the vowels, 
//i.e., a, e, i, o, u. If the match is found, increase the 
//value of count by 1 otherwise continue with the normal 
//flow of the program.

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		//Define a string
		String str = "Hello, my name is orlando Fernand";
		
		//Convert string to lowercase
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++)
			//checks whether the character is a vowel
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' 
			|| str.charAt(i) == 'i' || str.charAt(i) == 'o' 
			|| str.charAt(i) == 'u') {
				vowelCount ++;
			}
			//Checks whether a character is a consonant    
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				consonantCount ++;
			}
		
		System.out.println("Number of Vowels: " +vowelCount);
		System.out.println("Number of Consonants: " +consonantCount);

	}

}

//Output:
//Number of Vowels: 10
//Number of Consonants: 17


