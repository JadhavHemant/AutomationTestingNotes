package Tutorial2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		String a = "Apple is fruit with 2 seeds. Grapes may have seed or may not have seed Papaya and watermelon have multiple seeds. Seeds are integral part for growing plant.";
		
		
		
		String [] abc = a.split(" ");
		
		String c="";
		
		for(String b: abc)
		{
			if(b.equalsIgnoreCase("seeds"))
			{
				c=c+b;
				break;
			}
		}
		
		char [] xyz = c.toCharArray();
		
		LinkedHashMap<Character,Integer> hs =new LinkedHashMap<Character,Integer>();
		
		for(Character b: xyz)
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
		
		for(Entry<Character, Integer> d: hs.entrySet())
		{
			System.out.println(d.getKey() + " : "+d.getValue());
		}
		
		
		
	}

}
