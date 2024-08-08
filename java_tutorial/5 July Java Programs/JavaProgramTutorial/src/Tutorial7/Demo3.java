package Tutorial7;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Demo3 {

	public static void main(String[] args) {
		// Occurrence of vowels in String
		String a = "cucumber testing";

		char[] abc = a.toCharArray();

		Hashtable<Character, Integer> hs = new Hashtable();

		for (int i = 0; i < abc.length; i++) {

			if (hs.containsKey(abc[i])) {
				hs.put(abc[i], hs.get(abc[i]) + 1);
			} else {
				hs.put(abc[i], 1);
			}
		}

		for (Entry<Character, Integer> b : hs.entrySet()) {

			if (b.getValue() > 1) {

				if (b.getKey() == 'a' || b.getKey() == 'e' || b.getKey() == 'i' || b.getKey() == 'o'
						|| b.getKey() == 'u') {
					System.out.println(b.getKey() + " : " + b.getValue());
				}

			}
		}

	}

}
