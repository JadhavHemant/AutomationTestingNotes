package Tutorial6;

public class Demo9 {

	public static void main(String[] args) {
		String a = "radar";
		String b = "";

		for (int i = a.length()-1; i >=0 ; i--) 
		{
			b=b+a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");

		}
		
	}

}
