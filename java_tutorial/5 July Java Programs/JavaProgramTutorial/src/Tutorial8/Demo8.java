package Tutorial8;

public class Demo8 {

	public static void main(String[] args) {

		int a = 153;
		int temp1 = a;
		int temp2 = a;

		int reminder;
		double sum = 0;

		int n = 0;// 3
		// count how many numbers present in variable
		while (a > 0) {
			a = a / 10;
			n++;
		}

		while (temp1 > 0) {
			reminder = temp1 % 10;
			sum = sum + Math.pow(reminder, n);
			temp1 = temp1 / 10;
		}

		if (temp2 == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}

	}
}
