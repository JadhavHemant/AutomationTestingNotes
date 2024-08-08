package Tutorial1;

import java.util.Arrays;

public class AnagramDemo1 {

	public static void main(String[] args) {
		String a = "race";
		String b = "care";

		// convert a String into char[] array
		char[] p = a.toCharArray();

		// sort the p array
		Arrays.sort(p);

		// convert b string into char[] array
		char[] s = b.toCharArray();

		// sort the s arrat
		Arrays.sort(s);

		if (Arrays.equals(p, s)) {
			System.out.println("String is anagram");
		} 
		else {
			System.err.println("String is not anagram");
		}

	}

}
