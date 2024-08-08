package Tutorial4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		// find numbers in String
		String a = "java123#@$4SELENIUM";
		// 1 way
		String num1 = a.replaceAll("[^0-9]", "");
		System.out.println(num1);

		// 2 Way
		Matcher m1 = Pattern.compile("[0-9]").matcher(a);
		while (m1.find()) {
			System.out.print(m1.group());
		}

		System.out.println();
		// 3 Way
		Matcher m2 = Pattern.compile("(\\d)").matcher(a);
		while (m2.find()) {
			System.out.print(m2.group());
		}

		System.out.println();
		// 4 way
		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) {
			if (abc[i] >= 48 && abc[i] <= 57) {
				System.out.print(abc[i]);
			}
		}
		System.out.println();
		// 5. way
		char[] xyz = a.toCharArray();

		for (int i = 0; i < xyz.length; i++) {
			if (Character.isDigit(xyz[i])) {
				System.out.print(xyz[i]);
			}
		}
		System.out.println();

		// 6.way
		ArrayList<Character> arr = new ArrayList<Character>();
		char[] pqr = a.toCharArray();

		for (int i = 0; i < pqr.length; i++) {
			if (Character.isDigit(pqr[i])) {
				arr.add(pqr[i]);
			}
		}

		for (Character s : arr) {
			System.out.print(s);
		}

	}

}
