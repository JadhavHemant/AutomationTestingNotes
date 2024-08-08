package Tutorial1;

public class PalindromeDemo1 {

	public static void main(String[] args) {
		String a = "aaaa";

		String b = "";

		// print 4 to 0 value using for loop
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}

		if (a.equals(b)) {
			System.out.println("String is Palindrome");
		} else {
			System.err.println("String is not Palindrome");

		}

	}

}
