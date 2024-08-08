package Tutorial7;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo5 {

	public static void main(String[] args) {

		// print occurrence of vowels and constant

		String a = "cucumber testing";

		char[] abc = a.toCharArray();

		LinkedHashMap<Character, Integer> hs = new LinkedHashMap();

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
					System.out.println("vowels is " + b.getKey() + " : " + b.getValue());

				} else {
					System.out.println("Constant " + b.getKey() + " : " + b.getValue());
				}

			}
		}

	}

}
