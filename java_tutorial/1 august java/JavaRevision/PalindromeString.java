package JavaRevision;

public class PalindromeString {
	public static void main(String[] args) {
		
		String abc = "java";
		String rev = "";
		
		char[] c = abc.toCharArray();
		
		for(int i=abc.length()-1;i>=0;i--)
		{
			rev = rev+c[i];
		}
		
		if(abc.equals(rev))
		{
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

}
