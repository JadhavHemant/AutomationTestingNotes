package Tutorial2;

import java.util.*;
import java.util.Map.*;

public class RemoveDuplicateCharacterAndPrintOccurance1 {

	public static void main(String[] args) {
		String a = "java";

		// step 1: convert String into char [] array using toCharArray() method
		char[] abc = a.toCharArray();

		// step 2: create Object of LinkedHashMap class beacuse LinkedHashMap class does
		// not accept the duplicate key and also it will insert the values as per the
		// index position
		// we storing key as character and values as its occurance
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<Character, Integer>();

		// step 3: iterate char [] array values and add values to LinkedHashMap object

		for (Character b : abc) {
			hs.put(b, 1);
		}

		// step 4: iterate the LinkedHashMap by using enhance for loop and print
		// key-value pair
		// System.out.println(hs);

		for (Entry<Character, Integer> c : hs.entrySet()) {
			System.out.println(c.getKey() + " : " + c.getValue());
		}

	}

}
