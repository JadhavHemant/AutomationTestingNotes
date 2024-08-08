package Tutorial5;

public class Demo2 {

	public static void main(String[] args) {
		// *
		// *  *
		// *  *  *
		// *  *  *  * 
		// *  *  *  *  *
		
		//step 1 : iterate the rows
		for(int i=1;i<=5;i++)
		{
			//step 1: iterate the columns
			//if i values 1 then it will iterate inner loop 1 times
			//if i values 2 then it will iterate inner loop 2 times
			//if i values 3 then it will iterate inner loop 3 times
			//if i values 4 then it will iterate inner loop 4 times
			//if i values 5 then it will iterate inner loop 5 times
			
			//Because we take condition as like j<=i
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();

		}
		
		
		
	}

}
