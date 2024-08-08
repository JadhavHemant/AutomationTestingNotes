package Tutorial7;

public class Demo2 {

	public static void main(String[] args) {
		// count how many vowels in string
		String a = "cucumber";

		int counter = 0;

		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) 
		{
			if (abc[i] == 'a' || abc[i] == 'e' || abc[i] == 'i' || abc[i] == 'o' || abc[i] == 'u') 
			{
				counter++;
			}
		}

		System.out.println(counter);

	}

}
