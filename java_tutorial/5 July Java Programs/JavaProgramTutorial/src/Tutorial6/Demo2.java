package Tutorial6;

public class Demo2 {
//	1	2	3	4	5
//    2    3      4     5
//       3    4     5
//          4    5
//	        5
	public static void main(String[] args) {
			//i=3
		for (int i = 1; i <= 5; i++) 
		{
					//1<4
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			
				//j=3
			for(int j=i;j<=5;j++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}

	}

}
