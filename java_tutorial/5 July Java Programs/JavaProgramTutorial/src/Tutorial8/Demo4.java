package Tutorial8;

public class Demo4 {

	public static void main(String[] args) {
		// Armstrong number

		int a = 153;
		// 1*1*1 + 5*5*5 + 3*3*3
		// 1 + 125 + 27
		// = 153

		int b = 1 * 1 * 1;
		int c = 5 * 5 * 5;
		int d = 3 * 3 * 3;

		int e = b + c + d;

		if (a == e) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("number is not an Armstrong");
		}

	}

}
