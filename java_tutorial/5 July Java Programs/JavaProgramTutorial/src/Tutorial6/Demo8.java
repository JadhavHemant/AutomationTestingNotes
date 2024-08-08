package Tutorial6;

public class Demo8 {

	public static void main(String[] args) {
		String a = "28/03/2024";

		// remove / and print only number

		String b = a.replaceAll("/", "");
		System.out.println(b);

	}

}
