package Tutorial1;

public class Demo33 {

	public static void main(String[] args) {

		int num = 29;
		boolean flag = false;

		for (int i = 2; i < num; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}
