package Tutorial4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
		// find all Lower case letter
		String a = "java123#@$4SELENIUM";

		// 1 way
		String lc1 = a.replaceAll("[^a-z]", "");
		System.out.println(lc1);

		// 2 way
		Matcher m1 = Pattern.compile("[a-z]").matcher(a);
		while (m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println();
		// 2 way
		Matcher m2 = Pattern.compile("[^\\W \\d (A-Z)]").matcher(a);
		while (m2.find()) {
			System.out.print(m2.group());
		}
		System.out.println();

		// 3. way
		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) {
			if (abc[i] >= 97 && abc[i] <= 122) {
				System.out.print(abc[i]);
			}
		}
		System.out.println();
		// 4 way
		char[] xyz = a.toCharArray();

		for (int i = 0; i < xyz.length; i++) {
			if (Character.isLowerCase(xyz[i])) {
				System.out.print(xyz[i]);
			}
		}
		System.out.println();
		// 5 way
		char[] lmn = a.toCharArray();
		ArrayList<Character> arr = new ArrayList<Character>();

		for (int i = 0; i < lmn.length; i++) {
			if (Character.isLowerCase(lmn[i])) {
				arr.add(lmn[i]);
			}
		}

		for (Character s : arr) {
			System.out.print(s);
		}

	}

}
