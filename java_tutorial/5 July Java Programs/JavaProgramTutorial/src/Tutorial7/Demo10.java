package Tutorial7;

public class Demo10 {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i < 10; i++) {
			// addition a and b
			c = a + b;
			System.out.println(c);
			// allocate b values to a variable
			a = b;
			// allocate c values to b variable
			b = c;
		}

	}

}
