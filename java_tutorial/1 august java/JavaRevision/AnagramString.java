package JavaRevision;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String abc = "race";
		String pqr = "java";
		
		char[] a = abc.toCharArray();
		char[] b = pqr.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}

	}

}
