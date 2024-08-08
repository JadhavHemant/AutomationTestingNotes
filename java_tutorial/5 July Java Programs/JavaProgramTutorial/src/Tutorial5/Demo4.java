package Tutorial5;

public class Demo4 {

	public static void main(String[] args) {
		//  *  *  *  *  *
		//  *  *  *  *
		//  *  *  *
		//  *  *
		//  *
		
		//loop for iterate the row 5 to 1
		for(int i=5;i>=1;i--)
		{
			//if i values is 5 then it will iterate inner loop 5 times
			//if i values is 4 then it will iterate inner loop 4 times
			//if i values is 3 then it will iterate inner loop 3 times
			//if i values is 2 then it will iterate inner loop 2 times
			//if i values is 1 then it will iterate inner loop 1 times
			// Because we mention initial condition as j=i
			//loop for iterate the columns
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
