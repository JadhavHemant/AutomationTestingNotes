package Tutorial8;

public class Demo7 {

	public static void main(String[] args) {
		int a = 371;

		int temp = a;
		int reminder;
		int sum=0;

		while(a>0)
		{
			//1st it will find 3rd value
			//2nd it will find 2nd value
			//3rd it will find 1st value
			reminder=a%10;
			
			sum= (reminder*reminder*reminder)+sum;
			
			//it will find first 2 values
			//it will find first 1 value
			a=a/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");

		}
		
		
		
		
		
		
		
		
	}

}
