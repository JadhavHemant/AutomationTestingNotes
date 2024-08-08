package Tutorial7;

public class Demo6 {

	public static void main(String[] args) {
		// find min values in array
		int[] abc = { 100, 200, 40, 500, 600, 700 };

		int min = abc[0];

		for (int i = 0; i < abc.length; i++) {
			if (min > abc[i]) {
				min = abc[i];
			}
		}

		System.out.println(min);

	}

}
