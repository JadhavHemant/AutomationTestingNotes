package Tutorial5;

public class Demo5 {

	public static void main(String[] args) {
		// 1	2	3	4	5
		// 1	2	3	4
		// 1	2	3
		// 1	2
		// 1
		
		//iterate the loop for rows
		for(int i=5;i>=1;i--)
		{
			//if i values is 5 then it will iterate the inner loop 5 times
			//if i values is 4 then it will iterate the inner loop 4 times
			//if i values is 3 then it will iterate the inner loop 3 times
			//if i values is 2 then it will iterate the inner loop 2 times
			//if i values is 1 then it will iterate the inner loop 1 times
			//Because we mention condition as like j<=i 
			//iterate the loop for columns
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		

	}

}
