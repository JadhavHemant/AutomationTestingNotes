package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findOnlyUpperCaseLetter {

	public static void main(String[] args) {

		String a = "javaa@$4cucumbeR134ABC";

		// step 1: declare the pattern using compile() method
		Pattern p = Pattern.compile("[A-Z]");

		// step 2: apply pattern on String by using matchers() method and by passing the
		// String variable name

		Matcher m = p.matcher(a);

		String c = "";

		// step 3: iterate all the values and find matching value and group the matching
		// values

		while (m.find()) {
			c = c + m.group();
		}

		System.out.println(c);
	}

}
