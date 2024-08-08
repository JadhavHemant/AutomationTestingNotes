package Tutorial3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
		String input = "Welcome     to      the  interview session     please remove multiple       space    and add     single space";

		String b = input.replaceAll("\\s+", " ");
		
		System.out.println(b);
		

	}

}
