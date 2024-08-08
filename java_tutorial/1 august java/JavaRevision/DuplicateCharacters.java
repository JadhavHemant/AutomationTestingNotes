package JavaRevision;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {
// print duplicate character and its occurrence.
	public static void main(String[] args) {
		String abc = "cucumber";
		 
		char[] c = abc.toCharArray();
		
		Map<Character, Integer> h1 = new LinkedHashMap<Character, Integer>();
		
		for(char c1:c)
		{
			if(h1.containsKey(c1))
			{
				h1.put(c1, h1.get(c1)+1);
			}
			else {
				h1.put(c1, 1);
			}
		}
	
		System.out.println("Duplicate values are:" );

		for(Map.Entry<Character, Integer> entry : h1.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ "::" +entry.getValue());
			}
		}

			
	}

}
