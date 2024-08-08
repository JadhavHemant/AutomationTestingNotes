package Tutorial1;

public class PalindromeDemo2 {

	public static void main(String[] args) {
		String a = "aba";

		String b = "";// mada

		char[] c = a.toCharArray();
		// print value from 4 to 0 using for loop

		for (int i = c.length - 1; i >= 0; i--) {

			b = b + c[i];
		}

		if (a.equals(b)) {
			System.out.println("String is Palindrome");
		} else {
			System.err.println("String is not palindrome");
		}

	}

}
