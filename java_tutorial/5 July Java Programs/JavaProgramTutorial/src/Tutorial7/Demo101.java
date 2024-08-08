package Tutorial7;

import java.util.LinkedHashSet;

public class Demo101 {

	public static void main(String[] args) {
		//
		int[] abc = { 100, 20, 30, 100, 20, 40 };

		// Collections
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		for (int i = 0; i < abc.length; i++) {
			hs.add(abc[i]);
		}

		System.out.println(hs);

	}

}
