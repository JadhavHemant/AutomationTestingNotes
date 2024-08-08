package Tutorial2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CountWordsFromStringAndPrintitsOccurance {

	public static void main(String[] args) {
		String a = "selenium  selenium cucumber java";

		String[] abc = a.split(" ");
		
		System.out.println(abc.length);

		LinkedHashMap<String, Integer> hs = new LinkedHashMap<String, Integer>();

		for (String b : abc) {
			if (hs.containsKey(b)) {
				hs.put(b, hs.get(b) + 1);
			} else {
				hs.put(b, 1);
			}
		}

		for (Entry<String, Integer> c : hs.entrySet()) {

			System.out.println(c.getKey() + " : " + c.getValue());

		}

	}

}
