package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOnlyNumbersFromString2 {

	public static void main(String[] args) {
		String a = "java1!@$%#23Selenum45@#23cucumber";

		// declare the pattern by using compile() method
		// Pattern p =Pattern.compile("[0-9]");

		Pattern p = Pattern.compile("(\\d)");

		// apply pattern on predefined string by using matchers() method and by passing
		// string variable name

		Matcher m = p.matcher(a);

		// iterate all the values and find the matching values and group the matching
		// values

		while (m.find()) {
			String c = m.group();
			System.out.print(c);
		}

	}

}
