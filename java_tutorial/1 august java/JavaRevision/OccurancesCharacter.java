package JavaRevision;

import java.util.LinkedHashMap;

public class OccurancesCharacter {
//print character and occurrence of character
	public static void main(String[] args) {
		String abc = "Selenium";
		
		char[] c = abc.toCharArray();
		
		LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<Character, Integer>();
		
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
		System.out.println(h1);
	}

}
