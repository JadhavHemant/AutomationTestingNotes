package JavaRevision;

public class FindMin {

	public static void main(String[] args) {
		// find minimum value from array
		int[] abc = {43,65,3,98,55};
		
		int min=abc[0];
		
		for(int i=0; i<abc.length;i++)
		{
			if(abc[i]<min)
			{
				min= abc[i];
			}
		}
		System.out.println(min);
	}

}
