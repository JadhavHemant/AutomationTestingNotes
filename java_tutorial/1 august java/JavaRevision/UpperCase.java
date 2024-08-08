package JavaRevision;

public class UpperCase {

	public static void main(String[] args) {
		// find upper case character, lower case, special character and numbers
		
		String abc = "Ahfrtys@#$5657gra8H";
		
		System.out.println(abc.replaceAll("[^A-Z]", ""));
		System.out.println(abc.replaceAll("[^a-z]", ""));
		System.out.println(abc.replaceAll("[^0-9]", ""));
		System.out.println(abc.replaceAll("[A-Za-z0-9]", ""));
	}

}
