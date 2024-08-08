package Tutorial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AnagramDemo3 {

	public static void main(String[] args) {
		String a = "race";
		String b = "careee";

		// convert a string into char array
		char[] p = a.toCharArray();
		char[] s = b.toCharArray();

		// create object of ArrayList class
		ArrayList<Character> arr1 = new ArrayList<Character>();
		ArrayList<Character> arr2 = new ArrayList<Character>();

		// check p and s array length is equal or not
		if (p.length == s.length) 
		{
			for (int i = 0; i < p.length; i++) 
			{
				// adding values to arr1 and arr2 array
				arr1.add(p[i]);
				arr2.add(s[i]);
			}
			
			// sort arr1 and arr2 array
			Collections.sort(arr1);
			Collections.sort(arr2);
			System.out.println(arr1);
			
			if (arr1.equals(arr2)) 
			{
				System.out.println("String is anagram");
			} 
			else {
				System.err.println("String is not anagram");
			}
		}
		else {
			System.err.println("String is not anagram");
		}

		

	}

}
