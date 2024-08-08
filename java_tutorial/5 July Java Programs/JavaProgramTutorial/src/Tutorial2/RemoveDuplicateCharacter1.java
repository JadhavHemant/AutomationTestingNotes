package Tutorial2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter1 {

	public static void main(String[] args) {
		String a = "java";
		// step 1 : convert the String into the char[] array using toCharArray() method

		char[] abc = a.toCharArray();

		// step 2: create Object of LinkedHashSet class beacuse LinkedHashSet does not
		// accept the duplicate values and it will insert the values as per index
		// position

		// LinkedHashSet hs = new LinkedHashSet();
		// or
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		// step 3: iterate all char [] array values using for loop and add values to the
		// LinkedHashSet object using add() method

//		for (int i = 0; i < abc.length; i++) {
//			hs.add(abc[i]);
//		}
		// or
		for (Character b : abc) {
			hs.add(b);
		}

		// step 4: print values in console

		// System.out.println(hs);
		// or

		//Iterator it = hs.iterator();
		// or
		 Iterator<Character> it = hs.iterator();
		// it will check object/element is present or not in LinkedHashSet if present it
		// will execute while loop
		while (it.hasNext()) {
			// next() method it capture the values from LinkedHashSet
			System.out.println(it.next());
		}

	}
}
