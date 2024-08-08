package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		String a = "!2cD$%g5H&";

	
        

		// Matcher m = Pattern.compile("[^\\W]").matcher(a);

		Matcher m = Pattern.compile("[a-zA-Z0-9]").matcher(a);

		while (m.find()) {
			System.out.print(m.group());
		}

	}

}
