package Tutorial1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// Write a program to check characters from 
	//	String S1 and S2 present in string 3
		
		String s1 = "ABDDEFH";
		String s2 = "CDEFPQRS";
		
		String a=s1+s2;		//ABDCDEF
		
		char[] s =a.toCharArray();
		Arrays.sort(s);
		
		String s3 = "PQRSABDDEFCDEFH";
		char[] p= s3.toCharArray();
		Arrays.sort(p);
		
		
		if(Arrays.equals(s, p))
		{
			System.out.println("String S1 and S2 present in string 3");
		}
		else
		{
			System.out.println("String S1 and S2 value is not present in string 3");
		}
		
		
		
	}

}
