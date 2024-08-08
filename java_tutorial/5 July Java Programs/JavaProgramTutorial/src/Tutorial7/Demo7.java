package Tutorial7;

import java.util.ArrayList;
import java.util.Collections;

public class Demo7 {

	public static void main(String[] args) {
		// find minimum values in array using collection
		int[] abc = { 100, 200, 40, 500, 600, 700 };

		ArrayList<Integer> t = new ArrayList<Integer>();

		for (int i = 0; i < abc.length; i++) {
			t.add(abc[i]);
		}

		Collections.sort(t);

		System.out.println(t.get(0));// min
		System.out.println(t.get(1));// 2nd lowest

		System.out.println(t.get(t.size() - 1));// max

		System.out.println(t.get(t.size() - 2));// 2nd max

	}

}
