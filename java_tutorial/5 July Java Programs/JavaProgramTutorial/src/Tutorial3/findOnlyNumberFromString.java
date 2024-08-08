package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findOnlyNumberFromString {

	public static void main(String[] args) {
		String a = "java123Selenum45@#23cucumber";

		Pattern p = Pattern.compile("[0-9]");

		Matcher m = p.matcher(a);
		String c = "";

		while (m.find()) {
			c = c + m.group();
		}

		int d = Integer.parseInt(c);
		System.out.println(d);

	}

}
