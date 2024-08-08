package Tutorial1;

import java.util.Arrays;

public class AnagramDemo4 {

	public static void main(String[] args) {
		String a = "raceee";
		String b = "care";

		// convert string into char array
		char[] p = a.toCharArray();
		char[] s = b.toCharArray();

		// convert char[] in ascending order
		Arrays.sort(p);
		Arrays.sort(s);

		if (Arrays.equals(p, s)) {
			System.out.println("String is Anagram");
		} else {
			System.err.println("String is not anagram");
		}

	}
}
