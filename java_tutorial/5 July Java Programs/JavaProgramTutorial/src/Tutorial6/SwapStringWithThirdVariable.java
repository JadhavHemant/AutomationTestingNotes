package Tutorial6;

public class SwapStringWithThirdVariable {

	public static void main(String[] args) {

		String a = "java";

		String b = "selenium";

		// Step 1 : declare c variable and Assign a value into c variable
		String c = a;

		// Step 2: assign b values into a variable
		a = b;

		// Step 3: Assign c values into b variable
		b = c;

		System.out.println(a);// selenium
		System.out.println(b);// java

	}

}
