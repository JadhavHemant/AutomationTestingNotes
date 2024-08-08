package Tutorial7;

public class Demo1 {

	public static void main(String[] args) {
		//print vowels only
		String a = "testing";

		char xyz [] = {'a','e','i','o' ,'u'}; 
		
		char[] abc = a.toCharArray();

		for (int i = 0; i < abc.length; i++) {

			for (int j = 0; j < xyz.length; j++)
			{
				if(abc[i]==xyz[j])
				{
					System.out.println(abc[i]);
				}
			}
			
			
		}

	}

}
