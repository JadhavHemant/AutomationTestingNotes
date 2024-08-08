package Tutorial1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// Write a program to check characters
		// from String S1 & S2 present in string 3

		// condition1: string 1 and string 2 value present in string 3
		// condition2: string 1 and string 2 value is not present in string 3

		String s1= "ABD";
		String s2= "CDEF";
		String s3= "ABDDSEFC";
		String a = s1 + s2; // ABDCDEF

		char[] s = a.toCharArray();
		Arrays.sort(s);

		
		char[] p = s3.toCharArray();
		Arrays.sort(p);

		if (Arrays.equals(s, p)) {
			System.out.println("String S1 and S2 present in string 3");
		} else {
			System.err.println("String S1 and S2 value is not present in string 3");
		}

	}

}
