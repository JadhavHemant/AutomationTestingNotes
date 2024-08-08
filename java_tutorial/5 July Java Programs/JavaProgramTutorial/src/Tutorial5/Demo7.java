package Tutorial5;

public class Demo7 {

	public static void main(String[] args) {
//		1
//		2	3
//		4	5	6
		int counter=1;//
			//i=4
		for(int i=1;i<=5;i++)
		{				
					  //4<=3
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter + " ");//1   2 3   4 5 6
				counter++; 
			}
			System.out.println();
		}
		
		
		
	}

}
