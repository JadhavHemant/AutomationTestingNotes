package Tutorial5;

public class Demo3 {

	public static void main(String[] args) {
		// 3 2 1
		// 2 1
		// 1
		
		//loop for iterate the rows
				//i=0
		for(int i=5;i>=1;i--)
		{
			//loop for iterate the columns
			//if i values is 3 then it will iterate the loop 3 times
			//if i values is 2 then it will iterate the loop 2 times
			//if i values is 1 then it will iterate the loop 1 times
				//j=0
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");//3 2 1   2 1    1
			}
			
			System.out.println();
			
		}
			
		
		

	}

}
