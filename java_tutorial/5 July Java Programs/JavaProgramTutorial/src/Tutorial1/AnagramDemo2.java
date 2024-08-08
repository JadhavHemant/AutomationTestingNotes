package Tutorial1;

import java.util.TreeSet;

public class AnagramDemo2 {

	public static void main(String[] args) {
		String a = "race";
		String b = "careee";
		
		TreeSet<Character> t1 = new TreeSet<Character>();
		TreeSet<Character> t2 = new TreeSet<Character>();

		// check string is Anagram or not using Collection
		char[] p = a.toCharArray();
		char[] s = b.toCharArray();

		if (p.length == s.length) {
			for (int i = 0; i < p.length; i++) {
				t1.add(p[i]);
				t2.add(s[i]);
			}
		}

		if (t1.equals(t2)) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");

		}

	}

}
