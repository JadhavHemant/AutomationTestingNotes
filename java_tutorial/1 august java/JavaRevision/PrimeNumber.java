package JavaRevision;

public class PrimeNumber {

	public static void main(String[] args) {
		// check 17 is prime numbers or not
		
		int a = 17;
			
		for(int i=2; i<=a/2; i++)
		{
				if(a%i!=0)
				{
					//flag = false;
					System.out.println("Prime:" +a);
					break;
				}
				else {
					System.out.println("Not Prime");
					break;
				}
			}
		}
		
}


