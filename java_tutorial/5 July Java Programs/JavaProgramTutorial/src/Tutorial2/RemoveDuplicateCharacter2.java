package Tutorial2;

import java.util.*;

public class RemoveDuplicateCharacter2 {

	public static void main(String[] args) {
		String a = "java";

		// step 1: convert String into the char [] array using toCharArray() method
		char[] abc = a.toCharArray();

		// step 2: create Object of LinkedHashSet class because LinkedHashSet it does
		// not accept the duplicate values and also it maintain the insertion order
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		// Why u have not used HashSet class or TreeSet class?
		// HashSet class or TreeSet class it does not maintain the insertion order.

		// step3: iterate all the values using enhance for loop from char [] array and
		// add values to the LinkedHashSet object
		for (Character b : abc) {
			hs.add(b);
		}

		// step 4:use Iterator interface to iterate all values from the LinkedHashSet
		// object and print values in console using while loop
		Iterator<Character> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
