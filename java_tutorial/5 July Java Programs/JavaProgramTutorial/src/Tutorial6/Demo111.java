package Tutorial6;

public class Demo111 {

	public static void main(String[] args) {
		String a = "how are you o o";

		String b = a.replaceFirst("o", "@");
		int counter = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'o') {

				counter = counter + 1;

				if (counter == 1) {
					b = b.replace("o", "@@");
				}
				if (counter == 2) {
					b = b.replace("o", "@@@");
				}
			}

		}
		System.out.println(counter);

		System.out.println(b);
	}

}
