package Tutorial6;

public class Demo4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		

	}

}
