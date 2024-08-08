package Tutorial8;

public class Demo10 {

	public static void main(String[] args) {

		int a = 10;

		boolean b = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = false;
				break;
			}
		}

		if (b) {
			System.out.println("b variable is prime ");
		} else {
			System.out.println("B variable is not prime");
		}

	}

}
