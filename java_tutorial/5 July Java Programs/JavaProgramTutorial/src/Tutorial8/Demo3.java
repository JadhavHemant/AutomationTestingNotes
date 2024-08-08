package Tutorial8;

public class Demo3 {

	public static void main(String[] args) {
		int a = 459;// 4

		int reminder;

		int sum = 0;// 9+5=14

		// 0>0
		while (a > 0) {
			reminder = a % 10; // 4%10

			sum = sum + reminder;// 14+4 =18

			a = a / 10;// 4/10=0

		}
		System.out.println(sum);

	}

}
