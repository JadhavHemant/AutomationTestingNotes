package Tutorial6;

public class Demo7 {

	public static void main(String[] args) {
		String a = "111java123Selenium";

		String b = a.replaceAll("[^0-9]", "");

		int c = 0;

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) >= 48 && b.charAt(i) <= 57) {
				c = c + Integer.parseInt(String.valueOf(b.charAt(i)));
			}

		}

		System.out.println(c);

	}

}
