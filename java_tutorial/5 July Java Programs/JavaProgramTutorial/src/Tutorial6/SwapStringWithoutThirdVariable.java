package Tutorial6;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		String a = "cucumber";
		String b = "jenkins";

		a = a + b;

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}

}
