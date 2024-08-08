package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findOnlyUpperAndLowerCaseLetter {

	public static void main(String[] args) {
		String a = "java#$#$SEL000887ENIUM";

		// step 1: declare the pattern by using compile() method
		Pattern p = Pattern.compile("[a-zA-Z]");

		// step 2: apply pattern in predefined string using matchers() method and by
		// passing string variable name

		Matcher m = p.matcher(a);

		// step 3: iterate all the values and find the matching values and create the
		// group for matching value

		while (m.find()) {
			String c = m.group();
			System.out.print(c);
		}

	}

}
