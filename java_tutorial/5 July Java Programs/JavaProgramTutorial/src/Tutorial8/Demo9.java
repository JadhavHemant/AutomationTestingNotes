package Tutorial8;

public class Demo9 {

	public static void main(String[] args) {
		// check number is prime or not

		int a = 6;
		
		boolean b = true;//false
				//2<6
		for(int i=2;i<a;i++)
		{
			//6%2 = 0==0
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		
		if(b)
		{
			System.out.println("it is prime number "+a);
		}
		else
		{
			System.out.println("it is not Prime Number "+a);
		}
		
		
	}

}
