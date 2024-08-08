package Tutorial6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo6 {

	public static void main(String[] args) {
		String a="111java123Selenium";
		
		Matcher m = Pattern.compile("[0-9]").matcher(a);
		int c=0;
		
		while(m.find())
		{
			String b = m.group();
			
			int d = Integer.parseInt(b);
			c=c+d;
		}
		
		System.out.println(c);
		
		
				

	}

}
