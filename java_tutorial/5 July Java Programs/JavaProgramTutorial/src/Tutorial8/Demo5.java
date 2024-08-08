package Tutorial8;

public class Demo5 {

	public static void main(String[] args) {
		// Armstrong
		int a = 370;

		int first = a / 100; // 1

		// 153/10 = 15%10 = 5
		int second = (a / 10) % 10;

		// 153%10 = 3
		int third = a % 10;

		first = first * first * first;
		second = second * second * second;
		third = third * third * third;

		int sum = first + second + third;

		if (a == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}

	}

}
