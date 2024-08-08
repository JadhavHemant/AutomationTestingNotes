package JavaRevision;

public class Max {

	public static void main(String[] args) {
		// find max value from array
		
		int[] abc = {23,54,78,91,66};
		
		int max = abc[0];
		
		for(int i=0; i<abc.length; i++)
		{
		if(abc[i]>max)
		{
			max=abc[i];
		}
		}
		System.out.println(max);
	}

}
