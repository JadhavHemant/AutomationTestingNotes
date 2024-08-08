package Tutorial7;

public class Demo22 {

	public static void main(String[] args) {

		int[] abc = { 100, 20, 30, 100, 20, 40 };

		// step 1; iterate the values
		for (int i = 0; i < abc.length; i++) {

			// create boolean true variable
			boolean b = true;

			// iterate the value and use initial condition i+1
			for (int j = i + 1; j < abc.length; j++) {
				// if abc[i] ==abc[j] both values are equal then
				// change boolean variable condition to false and break the loop
				if (abc[i] == abc[j]) {
					b = false;
					break;
				}
			}

			// if b variable values is true then execute the if block code.
			if (b) {
				System.out.println(abc[i]);// 30 100 20 40
			}
		}

	}

}
