package Tutorial7;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		int[] abc = { 100, 0, 200, 0, 30, 40 };
		// o/p : 0 0 100 200 30 40

		int[] xyz = new int[abc.length];
		
		int counter = 0;
		
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] == 0) {
				counter++;
			}
		}
		System.out.println(counter);

		for (int i = 0; i < xyz.length; i++) {
			if (abc[i] != 0) {
				xyz[counter++] = abc[i];
			}
		}

		System.out.println(Arrays.toString(xyz));

	}

}
