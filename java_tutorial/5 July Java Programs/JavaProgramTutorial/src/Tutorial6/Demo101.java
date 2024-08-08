package Tutorial6;

public class Demo101 {

	public static void main(String[] args) {
//		Input = "how are you",   output = "h@w are y@@u"

		String a = "how are you";
		String c = "";

		int counter = 0;

		for (int i = 0; i < a.length(); i++) {

			c = c + a.charAt(i);

			if (a.charAt(i) == 'o') {
				counter = counter + 1;
			}

			if (counter == 1) {
				c = c.replaceFirst("o", "@");
			}

			if (counter == 2) {
				a = a.replace("o", "@@");
			}

		}

		System.out.println(counter);
		System.out.println(a);

	}

}
