import java.util.LinkedList;
import java.util.*;

//How do you reverse a Linked List?
//Declare a linked list.
//Add elements to that linked list.
//Apply the descending iterator method to the linked list.

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> IntegerList = new LinkedList<Integer>();
		
        // Appending elements at the end of the list
		IntegerList.add(new Integer(1));
		IntegerList.add(new Integer(2));
		IntegerList.add(new Integer(3));
		IntegerList.add(new Integer(4));
		IntegerList.add(new Integer(5));
		System.out.println("Elements before reversing :" +IntegerList);
		
		// Collections.reverse method takes a list as a
        // parameter and returns the reversed list
		Collections.reverse(IntegerList);
		
		System.out.println("Elements after reversing :" +IntegerList);
		
	}
}