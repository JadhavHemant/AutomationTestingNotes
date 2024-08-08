package JavaRevision;

public class ReverseNumber {
//reverse String
	public static void main(String[] args) {
		
		String abc= "Selenium";
		String rev = "";
		
		char[] c = abc.toCharArray();
		for(int i=abc.length()-1;i>=0;i--)
		{
			rev = rev + c[i];
			
		}
		System.out.println(rev);
		
		

	}

}
