package Tutorial3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) {

		String list1 = "John#2000$;nick#3000$;rose#1000$;andy#4000$;josh#5000$";
		// print name and salary

		String b = list1.replaceAll("[^a-zA-Z0-9]+", " ");

		String [] c = b.split(" ");

		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(c[i]);
		}
		
	}

}
