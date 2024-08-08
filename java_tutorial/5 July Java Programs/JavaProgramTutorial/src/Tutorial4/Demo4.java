package Tutorial4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) {
		// find special character
		String a = "java123#@$4SELENIUM";

		// 1 way
		String sp1 = a.replaceAll("[0-9a-zA-Z]", "");
		System.out.println(sp1);

		// 2 way
		Matcher m1 = Pattern.compile("[^0-9a-zA-Z]").matcher(a);
		while (m1.find()) {
			System.out.print(m1.group());
		}

		System.out.println();
		// 3 way
		Matcher m2 = Pattern.compile("(\\W)").matcher(a);
		while (m2.find()) {
			System.out.print(m2.group());
		}

		System.out.println();
		// 4 way
		char[] abc = a.toCharArray();
		for (int i = 0; i < abc.length; i++) {
			if (!((abc[i] >= 65 && abc[i] <= 90) || (abc[i] >= 48) && (abc[i] <= 57)
					|| ((abc[i] >= 97) && (abc[i] <= 122)))) {

				System.out.print(abc[i]);
			}
		}

		System.out.println();
		// 5 way
		char[] xyz = a.toCharArray();
		for (int i = 0; i < xyz.length; i++) {
			if (!((xyz[i] >= 'A' && xyz[i] <= 'Z') || ((xyz[i] >= 48) && (xyz[i] <= 57))
					|| ((xyz[i] >= 'a') && (xyz[i] <= 'z')))) {

				System.out.print(xyz[i]);
			}
		}
	}

}
