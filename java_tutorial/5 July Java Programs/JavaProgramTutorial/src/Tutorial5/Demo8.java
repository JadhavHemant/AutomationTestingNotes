package Tutorial5;

public class Demo8 {

	public static void main(String[] args) {

//		11	12	13	14	15
//		7	8	9	10
//		4	5	6
//		2	3
//		1

		int counter = 11;// 16 11 7 4 2

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}

			counter = counter - (i + (i - 1));
			System.out.println();
		}

	}

}
