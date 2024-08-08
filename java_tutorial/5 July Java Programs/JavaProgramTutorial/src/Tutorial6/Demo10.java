package Tutorial6;

public class Demo10 {

	public static void main(String[] args) {

		int a = 1221;

		String b = Integer.toString(a);
		String c = "";

		for (int i = b.length() - 1; i >= 0; i--) {
			c = c + b.charAt(i);
		}

		if (b.equalsIgnoreCase(c)) {
			System.out.println("int is Palindrome");
		} else {
			System.out.println("int is not Palindrome");

		}

	}

}
