package Tutorial3;

public class Demo2 {

	public static void main(String[] args) {
		String s = "!2cD$%g5H&";
		String result = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(result); // Output: 2cDg5H
		
	}

}
