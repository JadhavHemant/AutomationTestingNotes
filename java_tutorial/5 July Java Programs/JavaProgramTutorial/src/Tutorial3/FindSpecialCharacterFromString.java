package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialCharacterFromString {

	public static void main(String[] args) {

		String a = "java1!@$%#23Selenum45@#23cucumber";

		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		
		Matcher m =p.matcher(a);

		while (m.find()) {
			System.out.print(m.group());
		}

	}
}
