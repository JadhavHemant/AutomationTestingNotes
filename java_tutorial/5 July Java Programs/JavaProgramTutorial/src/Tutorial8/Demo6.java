package Tutorial8;

public class Demo6 {

	public static void main(String[] args) {
		int a = 370;// 15

		int temp = a;// 153

		int reminder;
		int sum = 0;// 153

		while (a > 0) {
			reminder = a % 10;

			sum = (reminder * reminder * reminder) + sum;

			a = a / 10;

		}

		if (temp == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}

	}

}
