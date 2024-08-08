package Tutorial7;

public class Demo121 {

	public static void main(String[] args) {
		String abc[] = { "java", "selenium", "java" };

		for (int i = 0; i < abc.length; i++) {
			boolean b = true;

			// Point 1: if abc[i]==abc[j] values are same/equal then it change b variable to
			// false and it will terminate the inner for loop

			// Point 2: if abc[i]==abc[j] values are not same/equals then it execute end to
			// end for block of code
			// and it will not update b variables values and by default b variable value is
			// same as like old.

			for (int j = i + 1; j < abc.length; j++) {
				// 100 == 100
				if (abc[i] == abc[j]) {
					b = false;
					break;
				}
			}

			// Point 1: if b variable value is false then it will skip if block of code
			// Point 2: if v variable value is old/ true then it will execute if block of code and
			// and it will print abc[i] values

			if (b) {
				System.out.println(abc[i]);// 200 100
			}

		}

	}

}
