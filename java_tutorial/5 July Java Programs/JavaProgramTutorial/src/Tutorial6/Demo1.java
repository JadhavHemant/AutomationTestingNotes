package Tutorial6;

public class Demo1 {
//	1	2	3	4	5
//    2    3      4     5
//       3    4     5
//           4    5
//	        5

	public static void main(String[] args) {
		//i=3
		for (int i = 1; i <= 5; i++) 
		{
					//2<3
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			//1st time 5 times
			//2nd time 4 times
			//3rd time 3 times
			//4th time 2 times
			//5th time 1 times
					//j=3
			for(int j=i;j<=5;j++)
			{
				System.out.print(j +" ");//1  2  3  4  5
				                         //  2  3  4  5 
				                         //   3   4  5
			}
			
			System.out.println();
		}

	}

}
