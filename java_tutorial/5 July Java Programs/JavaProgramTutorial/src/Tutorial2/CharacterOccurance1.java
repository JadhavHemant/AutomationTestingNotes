package Tutorial2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CharacterOccurance1 {

	public static void main(String[] args) {
		String a = "cucumrrtreeeeber";

		// step 1; convert the String into char [] array using toCharArray() method
		char[] abc = a.toCharArray();

		// step 2: create Object of LinkedHashMap class because LinkedHashMap class does
		// not accept the duplicate key and also it maintain the insertion order for key

		// we storing key as character and values as occurrence
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<Character, Integer>();

		// step 3: iterate the char [] array
		for (Character b : abc) {
			// step 3a: check specific key is present or not, and if present then increment
			// the value by 1
			if (hs.containsKey(b)) 
			{			//hs.get(b) it will capture values for that key.
				hs.put(b, hs.get(b)+1);
			}
			// step 3b: if key is not present then add the key-value
			else
			{
				hs.put(b, 1);
			}
		}

		// step 4: print LinkedHashMap object key-value using enhance for loop

				//System.out.println(hs);
		
		for(Entry<Character,Integer> c: hs.entrySet())
		{
			System.out.println(c.getKey() + " : "+c.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
