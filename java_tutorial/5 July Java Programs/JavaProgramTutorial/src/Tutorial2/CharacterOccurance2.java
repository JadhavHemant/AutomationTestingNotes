package Tutorial2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CharacterOccurance2 {

	public static void main(String[] args) {

		String a = "java";

		char[] abc = a.toCharArray();
		
		LinkedHashMap<Character,Integer> hs = new LinkedHashMap();

		for(Character b: abc)
		{
			if(hs.containsKey(b))
			{
				hs.put(b, hs.get(b)+1);
			}
			else
			{
				hs.put(b, 1);
			}
		}
		
		
		for(Entry<Character,Integer> c: hs.entrySet())
		{
			System.out.println(c.getKey() + " :: "+c.getValue());
		}
		
		
		
	}
}
