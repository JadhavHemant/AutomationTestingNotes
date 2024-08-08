package Tutorial2;

public class Demo2 {

	public static void main(String[] args) {
		String a = "javaconceptoftheday";
		// o/p : oftheday

//		char[] abc = a.toCharArray();
		
		int max = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) 
			{
				if(a.charAt(i)==a.charAt(j))
				{
					int b =  a.subSequence(i, j+1).length();
					
					if(b>max)
					{
						max=b;
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
