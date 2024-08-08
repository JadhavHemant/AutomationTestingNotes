package Tutorial7;

public class Demo4 {

	public static void main(String[] args) {
		// print vowels count and constant count
		String a = "cucumber"; // vowels= 3 uue
								// constant =5 ccmbr

		int vowelsCount = 0;
		int constantCount = 0;

		char abc[] = a.toCharArray();

		for (int i = 0; i < abc.length; i++) {

			if (abc[i] == 'a' || abc[i] == 'e' || abc[i] == 'i' || abc[i] == 'o' || abc[i] == 'u') {
				vowelsCount++;
			} else {
				constantCount++;
			}
		}

		System.out.println(vowelsCount);
		System.out.println(constantCount);
	}

}
