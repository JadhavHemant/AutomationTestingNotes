package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findOnlyLowerCaseLetter {

	public static void main(String[] args) {

		String a = "JavasELENIuM231252@#$$@m";

//		step 1: declare the pattern using compile() method

		Pattern p = Pattern.compile("[a-z]");

		// step 2: apply pattern on a String by using matchers()method by passing String
		// variable name

		Matcher m = p.matcher(a);

		// iterate the values and find the matching values from String

		while (m.find()) {
			String c = m.group();
			System.out.print(c);
		}

	}

}
